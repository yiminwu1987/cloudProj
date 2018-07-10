homeModule.controller('ClassificationAttrInfoCtrl', ['$scope', '$modalInstance', '$rootScope', '$http', 
                                                     'classificationid', 'id', 'name',
                                              function ($scope, $modalInstance, $rootScope, $http,
                                            		  classificationid, id, name) {
	$scope.attrInfo = {
			classificationid : classificationid,
			id : id,
			name : name
	}
	
	$scope.confirmSure = function() {
		$modalInstance.close($scope.attrInfo); 
	}
	
	$scope.confirmCancel = function() {
		$modalInstance.dismiss('cancel');
	}
	
	$scope.validate = function() {
		return $scope.attrInfo.name != null && $scope.attrInfo.name != '' && $scope.attrInfo.name.length <= 5
	}

}]);