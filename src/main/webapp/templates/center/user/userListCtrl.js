homeModule.controller('UserListCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', 'Paginator', 'ConfirmService',
      function ($scope, $rootScope, $http, $timeout, $interval, Paginator, ConfirmService) {
	$scope.tableCulumn = [{key:'name', name:'名称', type:'text', width: 250, sortable:true},
	                      {key:'code', name:'编号', type:'text', width: 250, sortable:true},
	                      {key:'typeDisplay', name:'类型', type:'text', width:250}];
	$scope.moduleName = 'user';
	$scope.busy = false;
	$scope.criteriaObj = {
	  	name:''
	};
	$scope.paginator = Paginator($scope, $http, $timeout, 10, ConfirmService);
	
	$scope.enterOperation = function() {
		$scope.paginator.reload();
	}
	
	
}])