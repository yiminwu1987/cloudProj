homeModule.controller('TopBarCtrl', ['$scope', '$rootScope', '$http', function ($scope, $rootScope, $http) {
	
	$scope.busy = false;
	$scope.getLoginInfo = function() {
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/center/getLoginInfo', 
		   method:'GET',
		   data: {},
		   success: function(data) {
			   if (data.success) {
				   $scope.user = data.data;
			   } 
			   $scope.busy = false;
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.getLoginInfo();

}]);