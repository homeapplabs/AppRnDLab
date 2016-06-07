<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Solution</title>
<link rel="stylesheet"
	href="/HomeSolution/resources/css/homesolution.css" />
<link rel="stylesheet" href="/HomeSolution/resources/css/bootstrap.css" />
<link rel="stylesheet"
	href="/HomeSolution/resources/css/angular-material.css" />
<link rel="stylesheet" href="/HomeSolution/resources/css/icon.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.js"></script> -->
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.js"></script> -->
<script src="/HomeSolution/resources/js/angular.js"></script>
<script src="/HomeSolution/resources/js/jquery.js"></script>
<script src="/HomeSolution/resources/js/angular-animate.js"></script>
<script src="/HomeSolution/resources/js/angular-aria.js"></script>
<script src="/HomeSolution/resources/js/angular-messages.js"></script>
<script src="/HomeSolution/resources/js/angular-material.js"></script>
<script src="/HomeSolution/resources/js/angular-route.js"></script>
<script src="/HomeSolution/resources/js/MyHomeApp.js"></script>
<script src="/HomeSolution/resources/js/LoginController.js"></script>
<script src="/HomeSolution/resources/js/RegistrationController.js"></script>
<script src="/HomeSolution/resources/js/TestController.js"></script>
<script src="/HomeSolution/resources/js/citiesController.js"></script>
<script src="/HomeSolution/resources/js/CountryController.js"></script>
<script src="/HomeSolution/resources/js/bootstrap.js"></script>
<%-- <script src="<c:url value="/resources/js/LoginController.js"/>" type="text/javascript"></script> --%>
</head>
<body ng-app="myHomeApp">
	<div class="container">
		<header>
		<div class="homesolution-header-content clearfix">
			<div class="homesolution-pnr-logo pull-left col-md-3">
				<img ng-src="/HomeSolution/resources/images/logo.png"
					alt="Virgin America" />
			</div>
			<div class="homesolution-title pull-right">Home Solution</div>
		</div>
		</header>

		<!-- Carousel start -->
		<div class="box" ng-controller="loginController">
			<div id="carousel" class="carousel slide" data-ride="carousel"
				data-interval="3000">
				<ol class="carousel-indicators">
					<li data-target="#carousel" data-slide-to="0" class="active"></li>
					<li data-target="#carousel" data-slide-to="1"></li>
					<li data-target="#carousel" data-slide-to="2"></li>
					<li data-target="#carousel" data-slide-to="3"></li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img src="/HomeSolution/resources/images/img_chania.jpg"
							alt="First Slide">
					</div>
					<div class="item">
						<img src="/HomeSolution/resources/images/img_chania2.jpg"
							alt="Second Slide">
					</div>
					<div class="item">
						<img src="/HomeSolution/resources/images/img_flower.jpg"
							alt="Third Slide">
					</div>
					<div class="item">
						<img src="/HomeSolution/resources/images/img_flower2.jpg"
							alt="Fourth Slide">
					</div>
				</div>
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#carousel" data-slide="prev"
					target="_blank"> <span class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="right carousel-control" href="#carousel"
					data-slide="next" target="_blank"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
		<!-- Carousel End -->
		<ng-view></ng-view>
	</div>
</body>
</html>