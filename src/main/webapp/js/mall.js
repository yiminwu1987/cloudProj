function AngularPaginator() {
	return function($scope, $http, $timeout, pageSize, ConfirmService) {
		var paginator = {
			moduleName : $scope.moduleName,
			criteriaObj : $scope.criteriaObj,
			pageInfo : {
				pageNum : 0,
				pageSize : pageSize
			},
			orderBy: '',
			orderByFieldMap:{},
			dataList : [],
			selectAll : false,
			
			hasNext : function() {
				return !this.pageInfo.isLastPage;
			},
			hasPrevious : function() {
				return !this.pageInfo.isFirstPage;
			},
			isFirst : function() {
				return this.pageInfo.isFirstPage;
			},
			isLast : function() {
				return this.pageInfo.isLastPage;
			},
			getLastPageNum: function() {
				return this.pageInfo.pages;
			},
			getPageNum: function() {
				return this.pageInfo.pageNum;
			},
			getTotalCount: function() {
				return this.pageInfo.totalCount;
			},
			getFirstIndex: function() {
				return ((this.pageInfo.pageNum-1) * this.pageInfo.pageSize) + 1;
			},
			getLastIndex: function() {
				return this.getFirstIndex() + this.dataList.length - 1;
			},
			getDataListCount: function() {
				return this.dataList == null ? 0 : this.dataList.length;
			},
			load : function(pageNum) {
				$scope.busy = true;
				var self = this;

				if (pageNum == null || pageNum < 0) {
					pageNum = 0;
				}
				// var postData = {pageNum:pageNum,
				// pageSize:this.pageInfo.pageSize};
				// $.extend(postData, self.criteriaObj);
				wtAjax({
					ajaxProvider : $http,
					url : webContext + '/' + self.moduleName + '/list',
					method : 'POST',
					data : [ {
						pageNum : pageNum,
						pageSize : this.pageInfo.pageSize,
						orderBy : this.orderBy
					}, self.criteriaObj ],
					success : function(data) {
						self.pageInfo.pageNum = data.pageNum;
						self.pageInfo.pageSize = data.pageSize;
						self.pageInfo.totalCount = data.total;
						self.pageInfo.pages = data.pages;
						self.pageInfo.isFirstPage = data.isFirstPage;
						self.pageInfo.isLastPage = data.isLastPage;
						self.dataList = data.list;
						self.selectAll = false;
						$scope.busy = false;
						
					},
					error : function(data) {
						$scope.busy = false;
					}
				});
			},
			loadFirst : function() {
				this.load(0);
			},
			loadLast : function() {
				this.load(this.pageInfo.pages);
			},
			loadPrevious : function() {
				if (!this.pageInfo.isFirstPage) {
					this.load(this.pageInfo.pageNum - 1);
				}
			},
			loadNext : function() {
				if (!this.pageInfo.isLastPage) {
					this.load(this.pageInfo.pageNum + 1);
				}
			},
			reload : function() {
				this.load(0);
			},
			reloadCurrentPage: function() {
				this.load(this.pageInfo.pageNum);
			},
			setOrderBy : function(sortField) {
				var sortBy = this.orderByFieldMap[sortField];
				if (sortBy == null || sortBy == '' || sortBy == 'desc') {
					sortBy = 'asc';
				} else {
					sortBy = 'desc';
				}
				this.orderBy = sortField + ' ' + sortBy;
				this.orderByFieldMap[sortField] = sortBy;
				this.reload();
			},
			getSortBy : function(sortField) {
				return this.orderByFieldMap[sortField];
			},
			selectItem : function(item) {
				item.selected = !item.selected;
				if (!item.selected) {
					this.selectAll = false;
				}
			},
			selectAllItem : function() {
				this.selectAll = !this.selectAll;
				if (this.dataList != null && this.dataList.length > 0) {
					for(var i = 0; i < this.dataList.length; i++) {
						this.dataList[i].selected = this.selectAll;
					}
				}
				
			},
			batchDelete : function() {
				var self = this;
				ConfirmService.openConfirmWindow('确定要删除吗？').then(function() {
					var ids = "";
					var count = 0;
					if (self.dataList != null && self.dataList.length > 0) {
						for(var i = 0; i < self.dataList.length; i++) {
							if (self.dataList[i].selected) {
								if (ids != '') {
									ids += ', '
								}
								ids += self.dataList[i].id;
								count ++;
							}
						}
					}
					if (ids == '') {
						showMsg($scope, '请选择要删除的记录！');
						return;
					}
					var data = {ids:ids};
					if ($scope.otherDataObj != null) {
						data = $scope.otherDataObj;
						data.ids = ids;
					}
					wtAjax({
					   ajaxProvider:$http,
					   url: webContext + '/' + self.moduleName + '/batchDelete',
					   method:'POST',
					   data:data,
					   success: function(data) {
						   if(data.success) {
							   showMsg($scope, '删除成功！');
							   if (self.dataList.length > count) {
								   self.reloadCurrentPage();
							   } else {
								   self.reload();
							   }
						   } else {
							   showMsg($scope, data.msg);
						   }
					   },
					   error:function(data){
						   alert(data);
					   }
				   });
			    });	
			},
			deleteItem : function(item) {
				var self = this;
				ConfirmService.openConfirmWindow('确定要删除吗？').then(function() {
					var data = {id:item.id};
					if ($scope.otherDataObj != null) {
						data = $scope.otherDataObj;
						data.id = item.id;
					}
					wtAjax({
					   ajaxProvider:$http,
					   url: webContext + '/' + self.moduleName + '/delete',
					   method:'POST',
					   data: data,
					   success: function(data) {
						   if(data.success) {
							   showMsg($scope, '删除成功！');
							   if (self.dataList.length > 1) {
								   self.reloadCurrentPage();
							   } else {
								   self.reload();
							   }
						   } else {
							   showMsg($scope, data.msg);
						   } 
					   },
					   error:function(data){
						   alert(data);
					   }
				   });
			   });
			},
			getSelectItems : function() {
				var ids = '';
				if (this.dataList != null && this.dataList.length > 0) {
					for(var i = 0; i < this.dataList.length; i++) {
						if (this.dataList[i].selected) {
							if (ids != '') {
								ids += ', '
							}
							ids += this.dataList[i].id;
						}
					}
				}
				return ids;
			},
			isSelectAll : function() {
				return this.selectAll;
			},
			doOtherOperation : function(operationFunc) {
				$scope.$eval(operationFunc);
			}
			
		};
		paginator.load();
		return paginator;
	};
}
angular.module('paginatorService', []).factory('Paginator', AngularPaginator);

function UploadService() {
	return function($scope, $http, objModelName, fieldName, fileId, maxWidth, maxHeight){
		var upload = {
			objModelName : objModelName,
			fieldName : fieldName,
			fileId : fileId,
			maxWidth : maxWidth,
			maxHeight : maxHeight,
			
			uploadImg : function(obj) {
				 var self = this;
				 $scope.busy = true;
				 var form = new FormData();
				 form.append('file', document.getElementById(fileId).files[0]);
				 wtAjax({
				    ajaxProvider:$http,
				    url: webContext + '/image/upload', 
				    method:'POST',
				    data: form,
		            headers: {'Content-Type': undefined},
		            transformRequest: angular.identity,
				    success: function(data) {
					   if (data.success) {
						   $scope[objModelName][fieldName] = data.data;
					   } 
					   $scope.busy = false;
				    },
				    error:function(data){
					   $scope.busy = false;
					   alert(data);
				    }
			    });
			},
			removeImg : function() {
				var self = this;
				 $scope.busy = true;
				 wtAjax({
				    ajaxProvider:$http,
				    url: webContext + '/image/delete', 
				    method:'POST',
				    data: {
				    	path : $scope[objModelName][fieldName]
				    },
				    success: function(data) {
					   if (data.success) {
						   $scope[objModelName][fieldName] = '';
						   document.getElementById(self.fileId).value = '';
					   } 
					   $scope.busy = false;
				    },
				    error:function(data){
					   $scope.busy = false;
					   alert(data);
				    }
			    });
				
			}
		};
		return upload;
	};
}
angular.module('uploadService', []).factory('Upload', UploadService);

var confirmService = angular.module('confirmService', ['ui.bootstrap']);
confirmService.factory('ConfirmService', function ($modal, $q) {
    return {
        openConfirmWindow: function (content) {
            var deferred = $q.defer();//生成deferred异步对象
            var modalInstance = $modal.open({
                templateUrl: webContext + '/templates/center/confirmModal/confirmModalTemplate.html',
                controller: 'ConfirmModalCtrl',
                size: 'sm', //尺寸
                resolve: {
                    data : function(){
                        return {content: content};
                    }
                }
            });
            modalInstance.result.then(function () {
              /*  if(!!modalInstance) {
                    modalInstance.dismiss('cancel');
                }*/
                deferred.resolve();
            }, function () {
                //$log.info('Modal dismissed at: ' + new Date())
            });
            return deferred.promise;
            /*
            var deferred = $q.defer();\\生成deferred异步对象
            deferred.resolve(rtns);\\执行到这里时，改变deferred状态为执行成功，
            返回rtns为从后台取到的数据，可以继续执行then,done返回data为报错，可以继续执行fail
            return deferred.promise;\\起到保护作用，不允许函数外部改变函数内的deferred状态
            把项目上的代码删去函数内容放上来，用于展示$q 的用法：
            $q用于ajax异步请求数据的回调控制deferred
            controller把数据请求发给service，
            service把请求给factory('myHttp',['$q',function($q){........}]);
            */
        }
    }
});

confirmService.controller('ConfirmModalCtrl', function ($scope, $modalInstance, data) {
    $scope.content = data.content;
    $scope.ok = function () {
        $modalInstance.close(); // 点击确认后关闭弹窗
    };
    $scope.cancel = function () {
        $modalInstance.dismiss('cancel'); // 点击取消后撤销模态框
    }
});

var selectService = angular.module('selectService', ['ui.bootstrap', 'paginatorService']);
selectService.factory('SelectService', function ($modal, $q) {
    return {
        openSelectWindow: function (moduleName, displayName, isMultiple) {
            var deferred = $q.defer();//生成deferred异步对象
            var modalInstance = $modal.open({
                templateUrl: webContext + '/templates/center/selectModal/selectModalTemplate.html',
                controller: 'SelectModalCtrl',
                size: 'lg', //尺寸
                resolve: {
                    data : function(){
                        return {
                        	moduleName: moduleName,
                        	isMultiple: isMultiple,
                        	displayName: displayName
                        };
                    }
                }
            });
            modalInstance.result.then(function (data) {
              /*  if(!!modalInstance) {
                    modalInstance.dismiss('cancel');
                }*/
                deferred.resolve(data);
            }, function () {
                //$log.info('Modal dismissed at: ' + new Date())
            });
            return deferred.promise;
        }
    }
});

selectService.controller('SelectModalCtrl', function ($scope, $http, $timeout, $modalInstance, Paginator, data) {
    $scope.moduleName = data.moduleName;
    $scope.isMultiple = data.isMultiple;
    $scope.displayName = data.displayName;
    $scope.selectItem = null;
    $scope.selectItemArr = [];
    
    $scope.busy = false;
	$scope.criteriaObj = {
	  	name:''
	};
	
	if ($scope.moduleName == 'product') {
	   $scope.tableCulumn = [{key:'name', name:'产品名称', type:'text', width: 150, sortable:true},
	                         {key:'codeno', name:'编号', type:'text', width: 150, sortable:true},
		                     {key:'imgurl', name:'缩略图', type:'imgUrl', width: 150, sortable:false},
		                     {key:'price', name:'价格', type:'price', width: 100, sortable:true},
		                     {key:'onsale', name:'上架', type:'boolean', width: 80, sortable:true}];
	} else if ($scope.moduleName == 'classification') {
		$scope.tableCulumn = [{key:'name', name:'分类名称', type:'text', width: 250, sortable:true},
		                      {key:'description', name:'描述', type:'text'}];
	} else if ($scope.moduleName == 'brand') {
		$scope.tableCulumn = [{key:'name', name:'品牌名称', type:'text', width: 250, sortable:true},
		                      {key:'logoimgurl', 'name':'LOGO', type:'imgUrl', width:250},
		                      {key:'description', name:'描述', type:'text'}];
	} else if ($scope.moduleName == 'layoutGroup') {
		$scope.tableCulumn = [{key:'name', name:'分组名称', type:'text', width: 250, sortable:true},
		                      {key:'imgurl', 'name':'展示图', type:'imgUrl', width:250},
		                      {key:'description', name:'描述', type:'text'}];
	} 
	
	$scope.paginator = Paginator($scope, $http, $timeout, 10);
	
	
    $scope.ok = function () {
    	if ($scope.isMultiple) { //多选
    		$modalInstance.close($scope.selectItemArr); // 点击确认后关闭弹窗
    	} else {
    		$modalInstance.close($scope.selectItem); // 点击确认后关闭弹窗
    	}
    };
    $scope.cancel = function () {
        $modalInstance.dismiss('cancel'); // 点击取消后撤销模态框
    }
    
    $scope.isSelected = function(item) {
    	if ($scope.isMultiple) { //多选
    		if ($scope.selectItemArr == null || $scope.selectItemArr.length <= 0) {
    			return false;
    		}
    		for (var i = 0; i < $scope.selectItemArr.length; i++) {
				if ($scope.selectItemArr[i].id == item.id) {
					return true;
				}
			}
    	} else {
    		if ($scope.selectItem != null && $scope.selectItem.id == item.id) {
    			return true;
    		}
    	}
    }
    
    $scope.selectItemOperation = function(item) {
    	if ($scope.isMultiple) { //多选
    		if (!$scope.isSelected(item)) {
    			$scope.selectItemArr[$scope.selectItemArr.length] = item;
    		} else {
    			for (var i = 0; i < $scope.selectItemArr.length; i++) {
    				if ($scope.selectItemArr[i].id == item.id) {
    					$scope.selectItemArr.splice(i, 1);
    					break;
    				}
    			}
    		}
    	} else {
    		if (!$scope.isSelected(item)) {
    			$scope.selectItem = item;
    		} else {
    			$scope.selectItem = null;
    		}
    	}
    }
    
    $scope.selectAllItemOperation = function() {
    	$scope.paginator.selectAll = !$scope.paginator.selectAll;
    	if ($scope.paginator.selectAll) {
    		for (var i = 0; i < $scope.paginator.dataList.length; i++) {
    			if (!$scope.isSelected($scope.paginator.dataList[i])) {
        			$scope.selectItemArr[$scope.selectItemArr.length] = $scope.paginator.dataList[i];
    			}
    		}
    	} else {
    		for (var j = 0; j < $scope.paginator.dataList.length; j++) {
    			if ($scope.isSelected($scope.paginator.dataList[j])) {
    				for (var i = 0; i < $scope.selectItemArr.length; i++) {
        				if ($scope.selectItemArr[i].id == $scope.paginator.dataList[j].id) {
        					$scope.selectItemArr.splice(i, 1);
        					break;
        				}
        			}
    			}
    		}
    	}
    }
    
    $scope.isSelectAllItems = function() {
    	for (var j = 0; j < $scope.paginator.dataList.length; j++) {
			if (!$scope.isSelected($scope.paginator.dataList[j])) {
				return false;
			}
		}
    	return true;
    }
    

    
    /*$scope.$watch('criteriaObj.name', function(newValue, oldValue) {
    	if ($scope.paginator != null) {
    		$scope.paginator.reload();
    	}
    });*/
});


function ValidationService() {
	return  {
		validate : function() {
			var hasError = false;
			var elements = angular.element('form#infoForm').find('[app-validation]');
			if (elements != null && elements.length > 0) {
				for (var i = 0; i < elements.length; i++) {
					var msg = checkElement(angular.element(elements[i]));
					if (!hasError && msg != '') {
						hasError = true;
					}	
				}
			}
			return !hasError;
		}
	};
}
angular.module('validationService', []).factory('ValidationService', ValidationService);
	
//app.repeatFinish
(function() {
    'use strict';
     angular.module('app.repeatFinish', []);
})();
(function() {
    'use strict';
     angular.module('app.repeatFinish').directive('appRepeatfinish',function(){
	    return {
	        link: function(scope,element,attrs){
	       		scope.$eval(attrs.appRepeatfinish);
	        }
	    }
	});
})();


//app.keyEnter
(function() {
    'use strict';
     angular.module('app.keyEnter', []);
})();
(function() {
    'use strict';
     angular.module('app.keyEnter').directive('appKeyenter',function(){
    	 return function (scope, element, attrs) {
		     element.bind("keydown keypress", function (event) {
			       if (event.which === 13) {
			         scope.$apply(function () {
			        	 scope.$eval(attrs.appKeyenter);
			         });
			         event.preventDefault();
			         event.stopPropagation();
			       }
		     });
		  };
	});
})();

//app.validation
(function() {
    'use strict';
     angular.module('app.validation', []);
})();
(function() {
    'use strict';
     angular.module('app.validation').directive('appValidation', function($compile){
    	 return function (scope, element, attrs) {
    		 if (attrs.appValidation.indexOf("maxlength=") >= 0) {
    			 if (attrs.appValidation.indexOf("hideCountSpan") < 0) {
    				 var validationArr = attrs.appValidation.split('|');
        			 if (validationArr != null && validationArr.length > 0) {
    				   	 for(var i = 0; i < validationArr.length; i++) {
    				   		if (validationArr[i].substr(0, 10) == "maxlength=") {
    				   			var maxlength = parseInt(validationArr[i].substr(10, validationArr[i].length));
    				   			var className = maxlength >= 100 ? 'textarea-numberbar2' : 'textarea-numberbar';
    			    			var lengthMsgSpan = $compile('<p class="' + className + '"><em class="textarea-length" id="currentLengthId"></em>/' + maxlength + '</p>')(scope);
    			    			element.parent().append(lengthMsgSpan);
    				   		}
    				   	 }
        			 }
    			 }
    		 } else if (attrs.appValidation.indexOf("currency") >= 0) {
    			 var currencyMsgSpan = $compile('<p class="textarea-numberbar">￥</p>')(scope);
	    		 element.parent().append(currencyMsgSpan);
    		 }
    		 var errorMsgSpan = $compile('<span class="error-msg ng-hide"></span>')(scope);
    		 element.parent().append(errorMsgSpan);
    		 checkElement(element);

    		/* element.bind("keyup", function (event) {
    			 checkElement(element);
    		 });*/
		 };
	});
})();

//app.table
(function() {
    'use strict';
     angular.module('app.table', []);
})();
(function() {
    'use strict';
     angular.module('app.table').directive('appTable',function(){
    	 return {
	        restrict: 'E',
	        replace: true,
	        templateUrl: webContext + '/templates/center/table/tableTemplate.html',
	        scope: false,   // 默认值
	        controller: null
    	 }
	});
})();

//app.msg
(function() {
    'use strict';
     angular.module('app.msg', []);
})();
(function() {
    'use strict';
     angular.module('app.msg').directive('appMsg',function(){
    	 return {
	        restrict: 'E',
	        replace: true,
	        template: '<div id="msgDiv" class="msgDiv">{{msg}}</div>',
	        scope: false,   // 默认值
	        controller: null
    	 }
	});
})();

//app.loading
(function() {
    'use strict';
     angular.module('app.loading', []);
})();
(function() {
    'use strict';
     angular.module('app.loading').directive('appLoading',function(){
    	 return {
	        restrict: 'E',
	        replace: true,
	        template: '<div id="loadingDiv" ng-show="busy" style="position:fixed;z-index:100;top:50%;left:50%"><img src="{{$root.webContext}}/images/loading.gif"  align="center"/></div>',
	        scope: false,   // 默认值
	        controller: null
    	 }
	});
})();

function checkElement(element) {
	var msg = '';
    var validationStr = element.attr('app-validation');
    if (validationStr.indexOf("maxlength=") >= 0) {
    	element.parent().find('#currentLengthId').text(element.val() != null ? element.val().trim().length + '' : '0');
    }
    var validationArr = validationStr.split('|');
    if (validationArr != null && validationArr.length > 0) {
	   	 for(var i = 0; i < validationArr.length; i++) {
	   		 var v = validationArr[i];
	   		 if (v == 'required') {
	   			 if (element.val() == null || element.val().trim() == '') {
	   				 msg = '该字段不能为空！';
	   				 break;
	   			 }
	   		 } else if (v.substr(0, 10) == "maxlength=") {
	   			 var maxlength = parseInt(v.substr(10, v.length));
	   			 if (element.val() != null && element.val().trim().length > maxlength) {
	   				 msg = '该字段不能超过最大字数' + maxlength + '！';
	   				 break;
	   			 }
	   		 } else if (v == 'float2') {
	   			if (!isPlusFloat(element.val(), 2, 1000000000000000)) {
		   			 msg = '该字段必须为正数，且最多保留两位小数！';
	   				 break;
	   			}
	   		 }
	   	 }
    }
  	element.parent().find('.error-msg').text(msg);
   	if (msg != '') {
   		 element.parent().find('.error-msg').removeClass('ng-hide');
   	} else {
   		 element.parent().find('.error-msg').addClass('ng-hide');
   	}
   	return msg;
}

function isScrollEnd() {
	return $(document).scrollTop() + $(window).height() + 600 >= $(document).height();
}
function isScrollBegin() {
	return $(document).scrollTop() <= 0;
}

function resizeDiv($scope, needSetdivHeight) {
	var isDefined = angular.isDefined($scope);
	if (!isDefined) {
		$scope = angular.element(document.body).scope();
	}
	var topNavbarHeight = $("#topNavbar").height();
	var bottomNavbarHeight = $("#bottomNavbar").height();
	$scope.divHeight = $(window).height() - topNavbarHeight
			- bottomNavbarHeight;
	$scope.windowHeight = $(window).height();
	$scope.windowWidth = $(window).width();
	$scope.scrollTop = $(document).scrollTop();
	if (!isDefined) {
		$scope.$apply();
	}
	if (needSetdivHeight) {
		document.body.style.height = $scope.divHeight + 'px';
	}

	/*
	 * var injector = angular.injector(["ng", "homeApp"]); var rootScope =
	 * injector.get("$rootScope"); var topNavbarHeight =
	 * $("#topNavbar").height(); var bottomNavbarHeight =
	 * $("#bottomNavbar").height(); rootScope.divHeight = $(window).height() -
	 * topNavbarHeight - bottomNavbarHeight; rootScope.windowHeight =
	 * $(window).height(); rootScope.windowWidth = $(window).width();
	 * rootScope.scrollTop = $(document).scrollTop(); rootScope.$apply();
	 */
}


function wtAjax(config) {
	var params = null;
	if (config.isSubmitForm) {
		params = config.data.serialize();
	} else if (config.data == null) {
		params = {};
	} else if ($.isArray(config.data)) {
		params = {};
		angular.forEach(config.data, function(obj) {
			$.extend(params, obj);
		});
	} else {
		params = config.data;
	}
	if (config.needGenUid) {
		params['UUIDStr'] = Math.uuid();
	}
	var promise = config.ajaxProvider({
		url : config.url,
		method : config.method == null ? "POST" : config.method,
		data : params,
		transformRequest : config.transformRequest == null ? (config.isSubmitForm ? null : function(data) {
			return $.param(data);
		}) : config.transformRequest,
		headers : config.headers == null ? {
			'Content-Type' : 'application/x-www-form-urlencoded;charset=UTF-8'
		} : config.headers
	});
	
	promise.success(config.success);

	promise.error(config.error);
}

function isWeiXin() {
	var ua = window.navigator.userAgent.toLowerCase();
	if (ua.match(/MicroMessenger/i) == 'micromessenger') {
		return true;
	} else {
		return false;
	}
}
function isWeiXinPhone() {
	var ua = window.navigator.userAgent.toLowerCase();
	if (ua.match(/windowswechat/i) == 'windowswechat') {
		return false;
	} else {
		return true;
	}
}
/**
 * check if the obj is null or if the obj is a String object then check is equals ''
 */
function isEmpty(inPara) {
    if (inPara) {
        var inStr = new String(trim(inPara.toString()));
        //return false if the string is not ''
        if (inStr != '' && inStr != 'null') {
           return false;
        }
    }
    
    return true;
}
function lTrim(str){
   var whitespace = new String(" \t\n\r");
   var s = new String(str);
   if (whitespace.indexOf(s.charAt(0)) != -1){
      var j=0, i = s.length;
      while (j < i && whitespace.indexOf(s.charAt(j)) != -1){
         j++;
      }
      s = s.substring(j, i);
   }
   return s.toString();
}


function rTrim(str){
   var whitespace = new String(" \t\n\r");
   var s = new String(str);
   if (whitespace.indexOf(s.charAt(s.length-1)) != -1){
      var i = s.length - 1;
      while (i >= 0 && whitespace.indexOf(s.charAt(i)) != -1) {
         i--;
      }
      s = s.substring(0, i+1);
   }
   return s.toString();
}

function trim(str){
   return rTrim(lTrim(str)).toString();
}
/**
 * check the string is int
 */
function isNumber(inPara, maxValue, minValue) {
   if (isEmpty(inPara)) {
      return true;
   }
   reg = /-?\d+/;
   var matchArray = inPara.match(reg);
   if (matchArray && matchArray.toString() == inPara) {
      if (maxValue && inPara > maxValue) {
         return false;
      }
      if (minValue && inPara < minValue) {
         return false;
      }
      return true;
   }
   return false;
}
function isPlusNumber(inPara, maxValue, minValue) {
   if (isEmpty(inPara)) {
      return true;
   }
   reg = /\d+/;
   var matchArray = inPara.match(reg);
   if (matchArray && matchArray.toString() == inPara) {
      if (maxValue && inPara > maxValue) {
         return false;
      }
      if (minValue && inPara < minValue) {
         return false;
      }
      return true;
   }
   return false;
}

function isFloat(inPara, point, maxValue, minValue) {
   var inStr = new String(inPara.toString());
   inStr = trim(inStr);
	if (inStr.match(/-?\d{1,3}(,\d{3})*\.?\d*$/)) {
		inStr = inStr.replace(/,/g, "");
	}
	
   reg = /-?\d*\.?\d*/;
   
   var matchArray = inStr.match(reg);
   if (matchArray && matchArray.toString() == trim(inStr)) {

      if (point != null && typeof point != 'undefined' || point == 0) {
		  if (inStr.indexOf(".") > -1 && inStr.length - inStr.indexOf(".") - 1 >  point) {
			  return false;
		  }
         var num = parseFloat(inStr);
        num = num * (Math.pow(10.0, point))                                
        num = Math.round(num) / (Math.pow(10.0, point))
        
        if ( Math.abs(num - parseFloat(inStr)) > 0.00000000000000001 ) {
            return false;
        }
      }
      
      if (maxValue != null && typeof maxValue != 'undefined') {
         var num = parseFloat(inStr);
         if (num > maxValue) {
            return false;
         }
      }
      
      if (minValue != null && typeof minValue != 'undefined') {
         var num = parseFloat(inStr);
         if (num < minValue) {
            return false;
         }
      }
      return true;
   }

   //test if the number in allow point
   
   
   return false
}

function isPlusFloat(inPara, point, maxValue) {
	var inStr = new String(inPara.toString());
	inStr = trim(inStr);
	if (inStr.match(/\d{1,3}(,\d{3})*\.?\d*$/)) {
		inStr = inStr.replace(/,/g, "");
	}
	
   reg = /\d*\.?\d*/;
   
   var matchArray = inStr.match(reg);
   if (matchArray && matchArray.toString() == trim(inStr)) {

      if (point != null && typeof point != 'undefined') {
		  if (inStr.indexOf(".") > -1 && inStr.length - inStr.indexOf(".") - 1 >  point) {
			  return false;
		  }
         var num = parseFloat(inStr);
        num = num * (Math.pow(10.0, point))                                
        num = Math.round(num) / (Math.pow(10.0, point))
        
        if ( Math.abs(num - parseFloat(inStr)) > 0.00000000000000001 ) {
            return false;
        }
      }
      
      var num = parseFloat(inStr);
      
      if (maxValue != null && typeof maxValue != 'undefined') {
         
         if (num > maxValue) {
            return false;
         }
      }
      
      if (num < 0) {
            return false;
    	 }
      return true;
   }

   //test if the number in allow point
   
   
   return false
}

function isPositiveFloat(inPara, point, maxValue) {
	if (isPlusFloat(inPara, point, maxValue))
	{
		if (parseFloat(inPara) > 0)
		{
			return true;
		}
	}
	return false;
}


function checkNum(obj, point, evt) { 
    if (point == 0) {
    	evt.returnValue = obj.value == '' ? event.keyCode>=49&&event.keyCode<=57 : event.keyCode>=48&&event.keyCode<=57;
    } 
    return;
}

function dateMinus(date1, date2) {
    var total = (date1.getTime() - date2.getTime())/1000;
    var day = parseInt(total / (24*60*60));//计算整数天数
    var afterDay = total - day*24*60*60;//取得算出天数后剩余的秒数
    var hour = parseInt(afterDay/(60*60));//计算整数小时数
    var afterHour = total - day*24*60*60 - hour*60*60;//取得算出小时数后剩余的秒数
    var min = parseInt(afterHour/60);//计算整数分
    var afterMin = parseInt(total - day*24*60*60 - hour*60*60 - min*60);//取得算出分后剩余的秒数
    return [day, hour, min, afterMin];
}

function PrefixInteger(num, length) {
    return ( "0000000000000000" + num ).substr( -length );
}

function showMsg($scope, msg) {
    $scope.msg = msg;
    angular.element('div#msgDiv')
	.animate({
		"height" : "80px"
	}, 300);
    setTimeout(function(){
	   angular.element('div#msgDiv')
		.animate({
			"height" : "0px"
		}, 300);
	   $scope.msg = '';
    }, 1000);
}