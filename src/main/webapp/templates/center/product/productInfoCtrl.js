homeModule.controller('ProductInfoCtrl', ['$scope', '$rootScope', '$http', '$timeout', '$interval', '$routeParams', 
                                          '$location', '$modal', 'Upload', 'ValidationService', 'SelectService',
      function ($scope, $rootScope, $http, $timeout, $interval, $routeParams, $location, $modal, Upload, ValidationService, SelectService) {
	$scope.busy = false;
	$scope.name = '';
	
	$scope.product = {
		id : $routeParams.id,
		name : '',
		codeno: '',
		description : '',
		price:0.00,
		imgurl : '',
		img1url : '',
		img2url : '',
		img3url : '',
		img4url : '',
		img5url : '',
		onsale : false,
		sellcount : 0,
		brandid: null,
		brandName : '',
		classificationid: null,
		classificationName:'',
		attrList: [],
		attrValueMap: {},
		otherAttrArr: []
	}
	
	$scope.enterOperation = function() {
		$scope.save();
	}
	
	$scope.save = function() { 
		if (!$scope.validate()) {
			return;
		}
		$scope.product.productDetail = $scope.editor.getAllHtml(); 
		var attrIdListStr = '';
		var attrValueListStr = '';
		if ($scope.product.attrList != null) {
			for (var i = 0; i < $scope.product.attrList.length; i++) {
				if (attrIdListStr != '') {
					attrIdListStr += ', ';
					attrValueListStr += ', ';
				}
				attrIdListStr += $scope.product.attrList[i].id;
				attrValueListStr += ($scope.product.attrList[i].value == null || 
						$scope.product.attrList[i].value == '' ? '' : $scope.product.attrList[i].value);
			}
		}
		$scope.product.attrIdListStr = attrIdListStr;
		$scope.product.attrValueListStr = attrValueListStr;
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/product/save', 
		   method:'POST',
		   data:$scope.product,
		   success: function(data) {
			   if (data.success) {
				   $scope.product.id = data.data;
				   $scope.name = $scope.product.name;
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
		   url: $rootScope.webContext + '/product/get', 
		   method:'GET',
		   data: {
			   id: $scope.product.id
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.product = data.data[0];
				   if (data.data[1] != null) {
					   $scope.product.classificationid = data.data[1].id;
					   $scope.product.classificationName = data.data[1].name;
					   $scope.getProductAttrValue();
				   }
				   if (data.data[2] != null) {
					   $scope.product.brandid = data.data[2].id;
					   $scope.product.brandName = data.data[2].name;
				   }
				   $scope.editor.execCommand('insertHtml', data.data[3]);
				   if (data.data[4] != null) {
					   $scope.product.otherAttrArr = data.data[4];
				   }
				   
				   $scope.name = $scope.product.name;
			   } else {
				   $location.path("/productList");
			   }
			   $scope.busy = false;
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
	
	$scope.selectBrand = function() {
		SelectService.openSelectWindow('brand', '品牌', false).then(function(data) {
			if (data != null) {
				$scope.product.brandid = data.id;
				$scope.product.brandName = data.name;
			}
			
		});
	}
	
	$scope.selectClassification = function(c) {
		SelectService.openSelectWindow('classification', '分类', false).then(function(data) {
			if (data != null) {
				$scope.product.classificationid = data.id;
				$scope.product.classificationName = data.name;
				
				$scope.getProductAttrValue();
			}
		});
	}
	
	$scope.removeClassification = function() {
		$scope.product.classificationid = null; 
		$scope.product.classificationName = '';
		$scope.product.attrList = [];
		$scope.product.attrValueMap = {}; 
		
	}
	
	$scope.getProductAttrValue = function() {
		$scope.busy = true;
		wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/product/getProductAttrValue', 
		   method:'POST',
		   data: {
			   productId: $scope.product.id,
			   classificationId: $scope.product.classificationid
		   },
		   success: function(data) {
			   if (data.success) {
				   $scope.product.attrList = data.data[0];
				   $scope.product.attrValueMap = data.data[1];
				   if ($scope.product.attrList != null) {
					   for (var i = 0; i < $scope.product.attrList.length; i++) {
						   $scope.product.attrList[i].value = $scope.product.attrValueMap[$scope.product.attrList[i].id];
					   }
				   }
			   } 
			   $scope.busy = false;
		   },
		   error:function(data){
			   $scope.busy = false;
			   alert(data);
		   }
	   });
	}
	
	$scope.addOtherAttr = function(item) {
		  var resolve = {
				productid:function () {
					return $scope.product.id;
				},
				id:function() {
					return item == null ? null : item.id;
				},
				name:function() {
					return item == null ? '' : item.name;
				},
				value:function() {
					return item == null ? '' : item.value;
				}
		  };
		  var modalInstance = $modal.open({
			  templateUrl: webContext + '/templates/center/product/productOtherAttrInfoTemplate.html',
			  controller:'ProductOtherAttrInfoCtrl',
			  resolve: resolve,
	          size : 'sm'
	      });
	      modalInstance.result.then(function (retValue) {
	    	 $scope.busy = true;
	  		 wtAjax({
	  			   ajaxProvider:$http,
	  			   url: $rootScope.webContext + '/product/saveOtherAttribute', 
	  			   method:'POST',
	  			   data:retValue,
	  			   success: function(data) {
	  				   if (data.success) {
	  					   $scope.product.otherAttrArr = data.data;
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
	
	$scope.removeOtherAttr = function(item) {
		$scope.busy = true;
	    wtAjax({
		   ajaxProvider:$http,
		   url: $rootScope.webContext + '/product/deleteOtherAttribute', 
		   method:'POST',
		   data:item,
		   success: function(data) {
			   if (data.success) {
				   $scope.product.otherAttrArr = data.data;
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
	
	$scope.upload = Upload($scope, $http, 'product', 'imgurl', 'imgurlInput');
	
	$scope.upload1 = Upload($scope, $http, 'product', 'img1url', 'img1urlInput');
	
	$scope.upload2 = Upload($scope, $http, 'product', 'img2url', 'img2urlInput');
	
	$scope.upload3 = Upload($scope, $http, 'product', 'img3url', 'img3urlInput');
	
	$scope.upload4 = Upload($scope, $http, 'product', 'img4url', 'img4urlInput');
	
	$scope.upload5= Upload($scope, $http, 'product', 'img5url', 'img5urlInput');
	
    $scope.editor = UE.getEditor('editor');
	
	$scope.editor.addListener('ready', function(edt) {
		if ($scope.product.id != null) {
			$scope.get();
		}
	});
	
	$scope.$on('$destroy',function(){  
		UE.delEditor('editor');
	});
	
	

}])