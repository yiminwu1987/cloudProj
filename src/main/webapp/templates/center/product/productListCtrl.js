homeModule.controller('ProductListCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', 
                                                 'Paginator', 'ConfirmService',
      function ($scope, $rootScope, $http, $timeout, $interval, Paginator, ConfirmService) {
	
	$scope.tableCulumn = [{key:'name', name:'名称', type:'text', width: 250, sortable:true},
	                      {key:'codeno', name:'编号', type:'text', width: 200, sortable:true},
	                      {key:'imgurl', name:'缩略图', type:'imgUrl', width: 150, sortable:false},
	                      {key:'price', name:'价格', type:'price', width: 100, sortable:true},
	                      {key:'description', name:'描述', type:'text'},
	                      {key:'onsale', name:'上架', type:'boolean', width: 80, sortable:true}];
	$scope.otherOperations = [{name:'上架', iconClass:'Hui-iconfont-shangjia', operationFunc:'setOnsale(true);'},
	                          {name:'下架', iconClass:'Hui-iconfont-xiajia', operationFunc:'setOnsale(false);'}];
	$scope.moduleName = 'product';
	
	$scope.busy = false;
	$scope.criteriaObj = {
	  	name:''
	};
	$scope.paginator = Paginator($scope, $http, $timeout, 10, ConfirmService);
	
	$scope.enterOperation = function() {
		$scope.paginator.reload();
	}
	
	$scope.setOnsale = function(isOnsale) {
		var confirmMsg = isOnsale ? '确定要上架吗？' : '确定要下架吗？';
		ConfirmService.openConfirmWindow(confirmMsg).then(function() {
			var ids = $scope.paginator.getSelectItems();
			if (ids == '') {
				showMsg($scope, '请选择要操作的记录！');
				return;
			}
			wtAjax({
			   ajaxProvider:$http,
			   url: webContext + '/product/setOnsale',
			   method:'POST',
			   data:{ids:ids, isOnsale:isOnsale},
			   success: function(data) {
				   if(data.success) {
					   showMsg($scope, '操作成功！');
					   $scope.paginator.reloadCurrentPage();
				   } else {
					   showMsg($scope, data.msg);
				   }
			   },
			   error:function(data){
				   alert(data);
			   }
		   });
	   });	
	}
}])