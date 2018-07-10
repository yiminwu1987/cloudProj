homeModule.controller('ProductOtherAttrInfoCtrl', ['$scope', '$modalInstance', '$rootScope', '$http', 
                                                     'productid', 'id', 'name', 'value',
                                              function ($scope, $modalInstance, $rootScope, $http,
                                            		  productid, id, name, value) {
	$scope.attrInfo = {
			productid : productid,
			id : id,
			name : name,
			value : value
	}
	
	$scope.confirmSure = function() {
		$modalInstance.close($scope.attrInfo); 
	}
	
	$scope.confirmCancel = function() {
		$modalInstance.dismiss('cancel');
	}
	
	$scope.validate = function() {
		return $scope.attrInfo.name != null && $scope.attrInfo.name != '' && $scope.attrInfo.name.length <= 5 &&
			$scope.attrInfo.value != null && $scope.attrInfo.value != '' && $scope.attrInfo.value.length <= 10
	}

}]);