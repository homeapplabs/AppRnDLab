var mainapp = angular.module("myModule", ['ngRoute'])
.config(function($routeProvider){
	$routeProvider
	.when('/home', {
		templateUrl: 'resources/pages/home.jsp',
		controller: 'homeCtrl'
	})
	.when('/contactus', {
		templateUrl: 'resources/pages/contactus.jsp',
		controller: 'contactCtrl'
	})
	.when('/founder', {
		templateUrl: 'resources/pages/founder.jsp',
		controller: 'founderCtrl'
	})
	.when('/aboutus', {
		templateUrl: 'resources/pages/aboutus.jsp',
		controller: 'aboutusCtrl'
	})
	.otherwise({
            redirectTo: '/home'
        });
})

.controller('homeCtrl', function($scope){
	$scope.homePageTitle='URBANAC Home';
})
.controller('contactCtrl', function($scope){
	
})
.controller('founderCtrl', function($scope){
	
})
.controller('aboutusCtrl', function($scope){
	
});

function AppCtrl($scope) {
    $scope.currentNavItem = 'page1';
  }
