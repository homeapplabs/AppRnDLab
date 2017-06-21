<html>
<head>
<link rel="stylesheet" href="/urbanacengineering/resources/css/bootstrap.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script> -->
<script src="/urbanacengineering/resources/js/angular.js"></script>
<script src="/urbanacengineering/resources/js/jquery.js"></script>
<script src="/urbanacengineering/resources/js/bootstrap.js"></script>
<script src="/urbanacengineering/resources/js/mainApp.js"></script>
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
				</a> <a class="right carousel-control" href="#carousel"
					data-slide="next" target="_blank"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
		<!-- Carousel End -->
		<ng-view></ng-view>
</body>
</html>