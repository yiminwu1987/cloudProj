homeModule.controller('UserInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', '$routeParams', '$location', 'Upload', 'ValidationService',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, Upload, ValidationService) {
	$scope.busy = false;
	
	$scope.name = '';

	$scope.user = {
		id : $routeParams.id,
		name : '',
		description : '',
        type: 'Profile',
        updatePassward: false
	}
	
	$scope.enterOperation = function() {
		$scope.save();
	}
	
	$scope.save = function() { 
		if (!$scope.validate()) {
			return;
		}
		if ($scope.user.type != 'Admin' && ($scope.user.updatePassward　|| $scope.user.id == null) &&　$scope.user.passward != $scope.user.passward2) {
			showMsg($scope, "两次密码不一致，请重新输入！");
			return;
		}
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/user/save', 
		   method:'POST',
		   data:$scope.user,
		   success: function(data) {
			   if (data.success) {
				   $scope.user = data.data;
				   $scope.name = $scope.user.name;
				   $scope.user.updatePassward = false;
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
		   url: $rootScope.webContext + '/user/get', 
		   method:'POST',
		   data: {
			   id: $scope.user.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.user = data.data;
				   $scope.name = $scope.user.name;
			   } else {
				   showMsg($scope, data.msg);
			   }
			   $scope.busy = false;
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.changePassward = function() {
		$scope.user.updatePassward = true;
		$scope.user.passward = '';
		$scope.user.passward2 = '';
	}
	
	$scope.validate = function() {
		return ValidationService.validate();
	}
	
	if ($scope.user.id != null) {
		$scope.get();
	}
	
}])