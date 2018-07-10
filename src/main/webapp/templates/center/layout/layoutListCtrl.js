homeModule.controller('LayoutListCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', 
                                                 'Paginator', 'ConfirmService',
      function ($scope, $rootScope, $http, $timeout, $interval, Paginator, ConfirmService) {
	
	$scope.tableCulumn = [{key:'name', name:'名称', type:'text', width: 250, sortable:true},
	                      {key:'showtypeDisplay', name:'显示类型', type:'text', width: 250, sortable:true},
	                      {key:'description', name:'描述', type:'text'}];
	$scope.moduleName = 'layout';
	
	$scope.busy = false;
	$scope.criteriaObj = {
	  	name:''
	};
	$scope.paginator = Paginator($scope, $http, $timeout, 10, ConfirmService);
	
	$scope.enterOperation = function() {
		$scope.paginator.reload();
	}
}])