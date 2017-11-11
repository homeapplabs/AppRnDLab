<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="/urbanacengineering/resources/css/bootstrap.css" />
<link rel="stylesheet"
	href="/urbanacengineering/resources/css/urbanac.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script> -->
<script src="resources/js/angular.js"></script>
<script src="resources/js/angular-route.js"></script>
<script src="resources/js/mainApp.js"></script>
<!-- <script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/angular-material.js"></script>
<script src="resources/js/angular-animate.js"></script>
<script src="resources/js/angular-aria.js"></script>
<script src="resources/js/angular-messages.js"></script> -->
</head>
<body ng-app="myModule">
	<h2>Welcome to URBANAC!</h2>

	<!-- Carousel start -->
	<!-- <div class="box">
		<div id="carousel" class="carousel slide" data-ride="carousel"
			data-interval="3000">
			<ol class="carousel-indicators">
				<li data-target="#/carousel" data-slide-to="0" class="active"></li>
				<li data-target="#/carousel" data-slide-to="1"></li>
				<li data-target="#/carousel" data-slide-to="2"></li>
				<li data-target="#/carousel" data-slide-to="3"></li>
				<li data-target="#/carousel" data-slide-to="4"></li>
				<li data-target="#/carousel" data-slide-to="5"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img src="resources/images/1.jpg"
						alt="First Slide">
				</div>
				<div class="item">
					<img src="resources/images/2.jpg"
						alt="Second Slide">
				</div>
				<div class="item">
					<img src="resources/images/3.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="resources/images/4.jpg"
						alt="Fourth Slide">
				</div>
				<div class="item">
					<img src="resources/images/5.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="resources/images/6.jpg"
						alt="Fourth Slide">
				</div>
				<div class="item">
					<img src="resources/images/7.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="resources/images/8.jpg"
						alt="Fourth Slide">
				</div>
			</div>

			<a class="left carousel-control" href="#carousel" data-slide="prev"
				target="_blank"> <span class="glyphicon glyphicon-chevron-left"></span>
			</a> <a class="right carousel-control" href="#carousel" data-slide="next"
				target="_blank"> <span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div> -->
	<!-- Carousel End -->
	<hr/>
<div class="row">
	<a href="#!/home">Home</a>
	<a href="#!/buildings">Buildings</a>
	<a href="#!/transportation">Transportation</a>
	<a href="#!/contracting">Contracting</a>
	<a href="#!/quantitysurveying">Quantity Surveying</a>
	<a href="#!/projectmanagement">Project Management</a>
	<a href="#!/dneservices">Design & Engineering Services</a>
	<a href="#!/contactus">Contact</a>
	<a href="#!/aboutus">About URBANAC</a>
</div>
<hr/>
<div class="container">
	<div ng-view></div>
</div>
</body>
</html>