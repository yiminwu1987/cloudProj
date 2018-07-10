homeModule.controller('LoginInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval',
      function ($scope, $rootScope, $http, $timeout, $interval) {
	$scope.user = {
		nameOrPhone:'',
		passward:''
	};
	
	$scope.busy = false;
	
	$scope.reset = function() {
		$scope.user.nameOrPhone = '';
		$scope.user.passward = '';
	}
	
	$scope.login = function() {
		if ($scope.user.nameOrPhone == '') {
			showMsg($scope, '名称/手机号码不能为空！');
			return;
		}
		if ($scope.user.passward == '') {
			showMsg($scope, '密码不能为空！');
			return;
	    }
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/center/doLogin', 
		   method:'POST',
		   data:$scope.user,
		   success: function(data) {
			   $scope.busy = false;
			   if (data.success) {
				   location.href = $rootScope.webContext + '/center/#' + data.data;//登陆成功跳转
				   return;
			   }
			   showMsg($scope, data.msg);
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.enterOperation = function() {
		$scope.login();
	}

}])