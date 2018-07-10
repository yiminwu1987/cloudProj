homeModule.controller('LayoutInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', 
                                                 '$interval', '$routeParams', '$location', 'ValidationService', 'SelectService',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, ValidationService, SelectService) {
	$scope.busy = false;
	$scope.name = '';

	$scope.layout = {
		id : $routeParams.id,
		name : '',
		description : '',
		showtype : 'Carousel',
		groupArr : []
	}
	
	$scope.enterOperation = function() {
		$scope.save();
	}
	
	$scope.save = function() { 
		if (!$scope.validate()) {
			return;
		}
		var maxLength = 1;
		if ('Carousel' == $scope.layout.showtype) {
			maxLength = 5;
		} else if ('Icon' == $scope.layout.showtyp) {
			maxLength = 12;
		}
		if ($scope.layout.groupArr.length > maxLength) {
			showMsg($scope, '分类最多可以设置' + maxLength + '个！');
			return;
		}
		$scope.busy = true;
		$scope.layout.groupIds = '';
		if ($scope.layout.groupArr != null && $scope.layout.groupArr.length > 0) {
			for (var i = 0; i < $scope.layout.groupArr.length; i++) {
				if ($scope.layout.groupIds != '') {
					$scope.layout.groupIds += ', ';
				}
				$scope.layout.groupIds += $scope.layout.groupArr[i].id;
			}
		}
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/layout/save', 
		   method:'POST',
		   data:$scope.layout,
		   success: function(data) {
			   if (data.success) {
				   $scope.layout.id = data.data;
				   $scope.name = $scope.layout.name;
			   }
			   $scope.busy = false;
			   showMsg($scope, data.msg);
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.get = function() { 
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/layout/get', 
		   method:'GET',
		   data: {
			   id: $scope.layout.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.layout = data.data[0];
				   $scope.layout.groupArr = data.data[1];
				   $scope.name = $scope.layout.name;
			   } else {
				   $location.path("/layoutList");
			   }
			   $scope.busy = false;
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.validate = function() {
		return ValidationService.validate();
	}
	
	$scope.selectGroup = function(c) {
		SelectService.openSelectWindow('layoutGroup', '分组', true).then(function(data) {
			if (data != null && data.length > 0) {
				for (var i = 0; i < data.length; i++) {
					var isExists = false;
					for (var j = 0; j < $scope.layout.groupArr.length; j++) {
						if (data[i].id == $scope.layout.groupArr[j].id) {
							isExists = true;
							break;
						}
					}
					if (!isExists) {
						$scope.layout.groupArr[$scope.layout.groupArr.length] = data[i];
					}
				}
			}
			var maxLength = 1;
			if ('Carousel' == $scope.layout.showtype) {
				maxLength = 5;
			} else if ('Icon' == $scope.layout.showtyp) {
				maxLength = 12;
			}
			if ($scope.layout.groupArr.length > maxLength) {
				showMsg($scope, '分类最多可以设置' + maxLength + '个！');
			}
			
		});
	}
	
	$scope.removeGroup = function(c) {
		if ($scope.layout.groupArr != null && $scope.layout.groupArr.length > 0) {
			for (var i = 0; i < $scope.layout.groupArr.length; i++) {
				if ($scope.layout.groupArr[i].id == c.id) {
					$scope.layout.groupArr.splice(i, 1);
				}
			}
		}
	}
	
	if ($scope.layout.id != null) {
		$scope.get();
	}
	
	
}])