<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>  
<%@ include file="/WEB-INF/pages/center/jspHeader.jsp" %>
<%@ page import="com.yiminwu.util.StringUtil" %>
<%
boolean isAdminLogin = StringUtil.toBoolean(request.getAttribute("isAdminLogin"), false);
%>
<html ng-app="homeApp" lang="en">
<head>
	<script type="text/javascript">
		var homeApp = angular.module('homeApp', ['ngRoute', 'homeModule', 'paginatorService', 'uploadService', 'confirmService', 'validationService', 'selectService']);
		homeApp.config(['$routeProvider', function ($routeProvider) {
		    $routeProvider.
		      when('/', {
		      	templateUrl: '<%=webContext %>/templates/center/error/error.html'
		      }).
		      when('/orderList', {
		      	controller: "OrderListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/order/orderList.html'
		      }).
		      when('/classificationList', {
		      	controller: "ClassificationListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/classification/classificationList.html'
		      }).
		      when('/classificationInfo/:id', {
		      	controller: "ClassificationInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/classification/classificationInfo.html'
		      }).
		      when('/classificationInfo/', {
		      	controller: "ClassificationInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/classification/classificationInfo.html'
		      }).
		      when('/brandList', {
		      	controller: "BrandListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/brand/brandList.html'
		      }).
		      when('/brandInfo/:id', {
		      	controller: "BrandInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/brand/brandInfo.html'
		      }).
		      when('/brandInfo/', {
		      	controller: "BrandInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/brand/brandInfo.html'
		      }).
		      when('/productList', {
		      	controller: "ProductListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/product/productList.html'
		      }).
		      when('/productInfo/:id', {
		      	controller: "ProductInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/product/productInfo.html'
		      }).
		      when('/productInfo', {
		      	controller: "ProductInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/product/productInfo.html'
		      }).
		      when('/layoutList', {
		      	controller: "LayoutListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layout/layoutList.html'
		      }).
		      when('/layoutInfo/:id', {
		      	controller: "LayoutInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layout/layoutInfo.html'
		      }).
		      when('/layoutInfo', {
		      	controller: "LayoutInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layout/layoutInfo.html'
		      }).
		      when('/layoutGroupList', {
		      	controller: "LayoutGroupListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layoutGroup/layoutGroupList.html'
		      }).
		      when('/layoutGroupInfo/:id', {
		      	controller: "LayoutGroupInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layoutGroup/layoutGroupInfo.html'
		      }).
		      when('/layoutGroupInfo', {
		      	controller: "LayoutGroupInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layoutGroup/layoutGroupInfo.html'
		      }).
		      when('/layoutGroupItemList/:id', {
		      	controller: "LayoutGroupItemListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/layoutGroup/layoutGroupItemList.html'
		      }).
		      when('/userList', {
		      	controller: "UserListCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/user/userList.html'
		      }).
		      when('/userInfo/:id', {
		      	controller: "UserInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/user/userInfo.html'
		      }).
		      when('/userInfo', {
		      	controller: "UserInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/user/userInfo.html'
		      }).
		      when('/profileInfo', {
		      	controller: "UserProfileInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/userProfile/userProfileInfo.html'
		      }).
		      otherwise({
		        redirectTo:'/'
		      });
		}
		]);

		var homeModule = angular.module('homeModule', ['app.repeatFinish', 'app.keyEnter', 'app.table', 'app.validation', 'app.msg', 'app.loading']);
		
		homeModule.run(function($rootScope, $http) {
			$rootScope.webContext = webContext;
			$rootScope.isAdminLogin = <%=isAdminLogin%>;
			
		});
	</script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/menu/menuCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/topBar/topBarCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/order/orderListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/product/productListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/classification/classificationListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/classification/classificationInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/classification/classificationAttrInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/brand/brandListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/brand/brandInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/product/productListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/product/productInfoCtrl.js"></script>
    <script type="text/javascript" src="<%=webContext %>/templates/center/product/productOtherAttrInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/layout/layoutListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/layout/layoutInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/layoutGroup/layoutGroupListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/layoutGroup/layoutGroupInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/layoutGroup/layoutGroupItemListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/user/userListCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/user/userInfoCtrl.js"></script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/userProfile/userProfileInfoCtrl.js"></script>
</head>
<body>
	<div ng-include="'<%=webContext %>/templates/center/topBar/topBar.html'"></div>
	<div ng-include="'<%=webContext %>/templates/center/menu/menu.html'"></div>
	<section class="Hui-article-box" style="position: absolute;top: 45px;bottom: 0;overflow: auto;" app-keyenter="enterOperation();" ng-view>
	</section>
</body>
</html>