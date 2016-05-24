<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Solution</title>
	<link href="<c:url value="/resources/css/homesolution.css.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet" />
    <link rel="stylesheet" href="<c:url value="/resources/css/angular-material.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/icon.css"/>">
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.js"></script> -->
    <script src="<c:url value="/resources/js/angular.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular-animate.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular-aria.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular-messages.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular-material.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/angular-route.js" />" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/MyHomeApp.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/LoginController.js"/>" type="text/javascript"></script>
</head>
<body ng-app="myHomeApp">
<div class="container">
    <header>
        <div class="homesolution-header-content clearfix">
            <div class="homesolution-pnr-logo pull-left col-md-3">
                <img ng-src="<c:url value="/resources/images/logo.png"/>" alt="Virgin America"/>
            </div>
            <div class="homesolution-title pull-right">
                Home Solution
            </div>
        </div>
    </header>
    <ng-view></ng-view>
</div>
</body>
</html>