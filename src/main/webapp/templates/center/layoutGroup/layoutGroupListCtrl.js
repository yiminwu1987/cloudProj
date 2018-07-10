homeModule.controller('LayoutGroupListCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', 
                                                 'Paginator', 'ConfirmService',
      function ($scope, $rootScope, $http, $timeout, $interval, Paginator, ConfirmService) {
	
	$scope.tableCulumn = [{key:'name', name:'名称', type:'text', width: 250, sortable:true},
	                      {key:'linktypeDisplay', name:'关联对象', type:'text', width: 250},
	                      {key:'imgurl', name:'展示图', type:'imgUrl', width: 150, sortable:false},
	                      {key:'description', name:'描述', type:'text'}];
	$scope.moduleName = 'layoutGroup';
	
	$scope.busy = false;
	$scope.criteriaObj = {
	  	name:''
	};
	$scope.paginator = Paginator($scope, $http, $timeout, 10, ConfirmService);
	
	$scope.enterOperation = function() {
		$scope.paginator.reload();
	}
}])