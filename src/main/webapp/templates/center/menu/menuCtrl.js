homeModule.controller('MenuCtrl', ['$scope', '$rootScope', '$http', '$location',
                                   function ($scope, $rootScope, $http, $location) {
	
	$scope.menuList = [];
	$scope.getMenus = function() {
		wtAjax({
			   ajaxProvider:$http,
			   url: $rootScope.webContext + '/center/getCenterMenus', 
			   method:'GET',
			   data:{},
			   success: function(data) {
				   $scope.menuList = data;
				   $scope.setSelectMenu();
				   
			   },
			   error:function(data){
				   alert(data);
			   }
		   });
	}
	
	$scope.setSelectMenu = function() {
	   var path = $location.path();
	   var selectIndex = -1;
	   if ($scope.menuList.length > 0) {
			for(var i = 0; i < $scope.menuList.length; i++) {
				if ($scope.menuList[i].subMenuList != null && $scope.menuList[i].subMenuList.length > 0) {
					for (var j = 0; j < $scope.menuList[i].subMenuList.length; j++) {
						if (path.indexOf($scope.menuList[i].subMenuList[j].moduleName + 'List') >= 0 ||
								path.indexOf($scope.menuList[i].subMenuList[j].moduleName + 'Info') >= 0 || 
								(path.indexOf('layoutGroupItemList') >= 0 && $scope.menuList[i].subMenuList[j].moduleName == 'layoutGroup')) {
							selectIndex = i;
							$scope.menuList[i].subMenuList[j].isSelected = true;
							$scope.menuList[i].isSelected = true;
						} else {
							$scope.menuList[i].subMenuList[j].isSelected = false;
							if (selectIndex != i) {
								$scope.menuList[i].isSelected = false;
							}	
						}
					}
				}
			} 
		}
	}
	
	$scope.renderFinish = function(index, layout, isLast) {
		if (isLast) {
		    $(".Hui-aside").Huifold({
					titCell:'.menu_dropdown dl dt',
					mainCell:'.menu_dropdown dl dd',
			});
		}
	};
	
	$scope.$on('$routeChangeSuccess', function(evt, current, previous) {
		$scope.setSelectMenu();
    }); 
	
	$scope.getMenus();
	 

}]);