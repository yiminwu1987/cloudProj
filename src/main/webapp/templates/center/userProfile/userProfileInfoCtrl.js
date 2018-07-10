homeModule.controller('UserProfileInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', '$routeParams', '$location', 'Upload', 'ValidationService',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, Upload, ValidationService) {
	$scope.busy = false;
	
	$scope.name = '';

	$scope.profile = {
		id : null,
		name : '',
		imgurl:'',
		description : '',
		instroduction: '',
		phone: '',
		wechatno: '',
		qrcodeurl: '',
		email: '',
		company: '',
		tag:'',
		address: '',
		sharecontent:''   
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
		   url: $rootScope.webContext + '/user/saveProfile', 
		   method:'POST',
		   data:$scope.profile,
		   success: function(data) {
			   if (data.success) {
				   //$scope.profile = data.data;
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
		   url: $rootScope.webContext + '/user/getProfile', 
		   method:'POST',
		   data: {},
		   success: function(data) {
			   if (data.success && data.data != null) {
				   $scope.profile = data.data;
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
	
    $scope.get();
	
	$scope.upload = Upload($scope, $http, 'profile', 'imgurl', 'imgUploadInput');
	$scope.upload2 = Upload($scope, $http, 'profile', 'qrcodeurl', 'imgUploadInput2');
	
	
}])