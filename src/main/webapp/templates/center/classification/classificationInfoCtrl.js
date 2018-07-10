homeModule.controller('ClassificationInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', 
                                                 '$interval', '$routeParams', '$location', '$modal', 'ValidationService', 'Upload', 
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, $modal, ValidationService, Upload) {
	$scope.busy = false;
	$scope.name = '';

	$scope.classification = {
		id : $routeParams.id,
		name : '',
		description : '',
		imgurl : '',
		attrArr : []
	}
	
	$scope.enterOperation = function() {
		$scope.save();
	}
	
	$scope.save = function() { 
		if (!$scope.validate()) {
			return;
		}
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/classification/save', 
		   method:'POST',
		   data:$scope.classification,
		   success: function(data) {
			   if (data.success) {
				   $scope.classification.id = data.data;
				   $scope.name = $scope.classification.name;
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
	
	$scope.get = function() { 
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/classification/get', 
		   method:'GET',
		   data: {
			   id: $scope.classification.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.classification = data.data[0];
				   $scope.classification.attrArr = data.data[1];
				   $scope.name = $scope.classification.name;
			   } else {
				   $location.path("/classificationList");
			   }
			   $scope.busy = false;
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.addAttr = function(item) {
		  var resolve = {
				classificationid:function () {
					return $scope.classification.id;
				},
				id:function() {
					return item == null ? null : item.id;
				},
				name:function() {
					return item == null ? '' : item.name;
				}
		  };
		  var modalInstance = $modal.open({
			  templateUrl: webContext + '/templates/center/classification/classificationAttrInfoTemplate.html',
			  controller:'ClassificationAttrInfoCtrl',
			  resolve: resolve,
	          size : 'sm'
	      });
	      modalInstance.result.then(function (retValue) {
	    	 $scope.busy = true;
    		 wtAjax({
    			   ajaxProvider:$http,
    			   url: $rootScope.webContext + '/classification/saveAttribute', 
    			   method:'POST',
    			   data:retValue,
    			   success: function(data) {
    				   if (data.success) {
    					   $scope.classification.attrArr = data.data;
    				   }
    				   $scope.busy = false;
    				   showMsg($scope, data.msg);
    			   },
    			   error:function(data){
    				   $scope.busy = false;
    				   alert(data);
    			   }
    		   });
    	  
	      }, function (reason) {
	    	 
	      });
	      return modalInstance;
	}
	
	$scope.removeAttr = function(item) {
		$scope.busy = true;
	    wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/classification/deleteAttribute', 
		   method:'POST',
		   data:item,
		   success: function(data) {
			   if (data.success) {
				   $scope.classification.attrArr = data.data;
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
	
	$scope.validate = function() {
		return ValidationService.validate();
	}
	
	if ($scope.classification.id != null) {
		$scope.get();
	}
	
	$scope.upload = Upload($scope, $http, 'classification', 'imgurl', 'imgUploadInput');
	
	
}])