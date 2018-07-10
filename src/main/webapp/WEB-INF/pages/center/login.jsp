<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ include file="/WEB-INF/pages/center/jspHeader.jsp" %>
<html ng-app="homeApp" lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="<%=webContext %>/css/login.css" />
	<script type="text/javascript">
		var homeApp = angular.module('homeApp', ['ngRoute', 'homeModule', 'paginatorService', 'uploadService', 'confirmService', 'validationService', 'selectService']);
		homeApp.config(['$routeProvider', function ($routeProvider) {
		    $routeProvider.
		      when('/', {
		      	controller: "LoginInfoCtrl",
		      	templateUrl: '<%=webContext %>/templates/center/login/loginInfo.html'
		      }).
		      otherwise({
		        redirectTo:'/'
		      });
			}
		]);

		var homeModule = angular.module('homeModule', ['app.repeatFinish', 'app.keyEnter', 'app.table', 'app.validation', 'app.msg', 'app.loading']);
		
		homeModule.run(function($rootScope, $http) {
			$rootScope.webContext = webContext;
		});
	</script>
	<script type="text/javascript" src="<%=webContext %>/templates/center/login/loginInfoCtrl.js"></script>
</head>
<body>
<div class="loginWraper" app-keyenter="enterOperation();" ng-view></div>
</body>
</html>