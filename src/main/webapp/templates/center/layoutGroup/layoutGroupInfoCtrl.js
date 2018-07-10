homeModule.controller('LayoutGroupInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', 
                                                 '$interval', '$routeParams', '$location', 'ValidationService', 'Upload',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, ValidationService, Upload) {
	$scope.busy = false;
	$scope.name = '';
	$scope.linktype = '';
	$scope.showLinkBtn = false;

	$scope.layoutGroup = {
		id : $routeParams.id,
		name : '',
		description : '',
		linktype : 'Product',
		imgurl : ''
	}
	
	$scope.enterOperation = function() {
		$scope.save();
	}
	
	$scope.save = function() { 
		if (!$scope.validate()) {
			return;
		}
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/layoutGroup/save', 
		   method:'POST',
		   data:$scope.layoutGroup,
		   success: function(data) {
			   if (data.success) {
				   $scope.layoutGroup.id = data.data;
				   $scope.name = $scope.layoutGroup.name;
				   $scope.linktype = $scope.layoutGroup.linktype;
				   $scope.showLinkBtn = true;
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
		   url: $rootScope.webContext + '/layoutGroup/get', 
		   method:'GET',
		   data: {
			   id: $scope.layoutGroup.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.layoutGroup = data.data;
				   $scope.name = $scope.layoutGroup.name;
				   $scope.linktype = $scope.layoutGroup.linktype;
				   $scope.showLinkBtn = true;
			   } else {
				   $location.path("/layoutGroupList");
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
	
	if ($scope.layoutGroup.id != null) {
		$scope.get();
	}
	
	$scope.upload = Upload($scope, $http, 'layoutGroup', 'imgurl', 'imgurlInput');
	
	
}])