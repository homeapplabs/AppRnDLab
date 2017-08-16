<html>
<head>
<link rel="stylesheet"
	href="/urbanacengineering/resources/css/bootstrap.css" />
<link rel="stylesheet"
	href="/urbanacengineering/resources/css/urbanac.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script> -->
<script src="/urbanacengineering/resources/js/angular.js"></script>
<script src="/urbanacengineering/resources/js/jquery.js"></script>
<script src="/urbanacengineering/resources/js/bootstrap.js"></script>
<script src="/urbanacengineering/resources/js/mainApp.js"></script>
<script src="/urbanacengineering/resources/js/angular-animate.js"></script>
<script src="/urbanacengineering/resources/js/angular-aria.js"></script>
<script src="/urbanacengineering/resources/js/angular-messages.js"></script>
<script src="/urbanacengineering/resources/js/angular-material.js"></script>
<script src="/urbanacengineering/resources/js/angular-route.js"></script>
</head>
<body ng-app="myModule">
	<h2>Welcome to URBANAC!</h2>

	<!-- Carousel start -->
	<div class="box">
		<div id="carousel" class="carousel slide" data-ride="carousel"
			data-interval="3000">
			<ol class="carousel-indicators">
				<li data-target="#carousel" data-slide-to="0" class="active"></li>
				<li data-target="#carousel" data-slide-to="1"></li>
				<li data-target="#carousel" data-slide-to="2"></li>
				<li data-target="#carousel" data-slide-to="3"></li>
				<li data-target="#carousel" data-slide-to="4"></li>
				<li data-target="#carousel" data-slide-to="5"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img src="/urbanacengineering/resources/images/1.jpg"
						alt="First Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/2.jpg"
						alt="Second Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/3.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/4.jpg"
						alt="Fourth Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/5.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/6.jpg"
						alt="Fourth Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/7.jpg"
						alt="Third Slide">
				</div>
				<div class="item">
					<img src="/urbanacengineering/resources/images/8.jpg"
						alt="Fourth Slide">
				</div>
			</div>

			<a class="left carousel-control" href="#carousel" data-slide="prev"
				target="_blank"> <span class="glyphicon glyphicon-chevron-left"></span>
			</a> <a class="right carousel-control" href="#carousel" data-slide="next"
				target="_blank"> <span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	<!-- Carousel End -->
		<!-- <nav class="navbar navbar-default navbar-static-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand"
						href="http://localhost:8080/urbanacengineering"> 
						<img alt="Brand-img"
						src="/urbanacengineering/resources/images/1-01-128.png">
					</a>
				</div>
			</div>
		</nav> -->
		
		<div ng-controller="AppCtrl" ng-cloak>
  <md-content class="md-padding">
    <md-nav-bar
      md-selected-nav-item="currentNavItem"
      nav-bar-aria-label="navigation links">
      <md-nav-item md-nav-click="goto('page1')" name="page1">
        Page One
      </md-nav-item>
      <md-nav-item md-nav-click="goto('page2')" name="page2">
        Page Two
      </md-nav-item>
      <md-nav-item md-nav-click="goto('page3')" name="page3">
        Page Three
      </md-nav-item>
      <!-- these require actual routing with ui-router or ng-route, so they
      won't work in the demo
      <md-nav-item md-nav-href="#page4" name="page5">Page Four</md-nav-item>
      <md-nav-item md-nav-sref="app.page5" name="page4">Page Five</md-nav-item>
      You can also add options for the <code>ui-sref-opts</code> attribute.
	  <md-nav-item md-nav-sref="page6" sref-opts="{reload:true, notify:true}">
        Page Six
      </md-nav-item>
      -->
    </md-nav-bar>
    <div class="text-content">
      External content for `<span>{{currentNavItem}}</span>`.
    </div>

    <!-- <md-checkbox ng-model="disableInkBar">Disable Ink Bar</md-checkbox> -->

  </md-content>
</div>
		
		
	<ng-view></ng-view>
</body>
</html>