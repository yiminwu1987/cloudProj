homeModule.controller('BrandInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', '$routeParams', '$location', 'Upload', 'ValidationService',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, Upload, ValidationService) {
	$scope.busy = false;
	
	$scope.name = '';

	$scope.brand = {
		id : $routeParams.id,
		name : '',
		description : '',
		logoimgurl : ''
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
		   url: $rootScope.webContext + '/brand/save', 
		   method:'POST',
		   data:$scope.brand,
		   success: function(data) {
			   if (data.success) {
				   $scope.brand.id = data.data;
				   $scope.name = $scope.brand.name;
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
		   url: $rootScope.webContext + '/brand/get', 
		   method:'GET',
		   data: {
			   id: $scope.brand.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.brand = data.data;
				   $scope.name = $scope.brand.name;
			   } else {
				   $location.path("/brandList");
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
	
	if ($scope.brand.id != null) {
		$scope.get();
	}
	
	$scope.upload = Upload($scope, $http, 'brand', 'logoimgurl', 'imgUploadInput');
	
}])