homeModule.controller('LayoutGroupItemListCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', '$routeParams',
                                                 'Paginator', 'ConfirmService', 'SelectService', 
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, Paginator, ConfirmService, SelectService) {
	
	$scope.id = $routeParams.id;
	
	$scope.name = '';
	
	$scope.linktype = '';
	
	$scope.moduleName = 'layoutGroupItem';
	
	$scope.hideTableEditBtn = true;
	
	$scope.busy = false;
	$scope.criteriaObj = {
		id: $routeParams.id,
	  	name:''
	};
	
	$scope.otherDataObj = {
		groupId: $routeParams.id
	}
	
	$scope.enterOperation = function() {
		$scope.paginator.reload();
	}
	
	$scope.get = function() { 
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/layoutGroup/get', 
		   method:'POST',
		   data: {
			   id: $scope.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.name = data.data.name;
				   $scope.linktype = data.data.linktype;
				   if ($scope.linktype == 'Product') {
					   $scope.tableCulumn = [{key:'name', name:'产品名称', type:'text', width: 250, sortable:true},
					                         {key:'codeno', name:'编号', type:'text', width: 200, sortable:true},
						                     {key:'imgurl', name:'缩略图', type:'imgUrl', width: 150, sortable:false},
						                     {key:'price', name:'价格', type:'price', width: 100, sortable:true},
						                     {key:'description', name:'描述', type:'text'},
						                     {key:'onsale', name:'上架', type:'boolean', width: 80, sortable:true}];
					} else if ($scope.linktype == 'Classification') {
						$scope.tableCulumn = [{key:'name', name:'分类名称', type:'text', width: 250, sortable:true},
						                      {key:'description', name:'描述', type:'text'}];
					} else if ($scope.linktype == 'Brand') {
						$scope.tableCulumn = [{key:'name', name:'品牌名称', type:'text', width: 250, sortable:true},
						                      {key:'logoimgurl', 'name':'LOGO', type:'imgUrl', width:250},
						                      {key:'description', name:'描述', type:'text'}];
					}  	
				   
				   $scope.paginator = Paginator($scope, $http, $timeout, 10, ConfirmService);
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
	
	$scope.addItems = function() {
		var moduleName = '';
		var displayName = '';
		if ($scope.linktype == 'Product') {
			moduleName = 'product';
			displayName = '产品';
		} else if ($scope.linktype == 'Classification') {
			moduleName = 'classification';
			displayName = '分类';
		} else if ($scope.linktype == 'Brand') {
			moduleName = 'brand';
			displayName = '品牌';
		}  	
		SelectService.openSelectWindow(moduleName, displayName, true).then(function(data) {
			if (data != null && data.length > 0) {
				var itemIds = '';
				for (var i = 0; i < data.length; i++) {
					if (itemIds != '') {
						itemIds += ', ';
					}
					itemIds += data[i].id;
				}
				$scope.save(itemIds);
			}
		});
	}
	
	$scope.save = function(itemIds) { 
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/layoutGroupItem/save', 
		   method:'POST',
		   data:{
			   id: $scope.id,
			   itemIds:itemIds
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.paginator.reload();
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
	
	$scope.get();
}])