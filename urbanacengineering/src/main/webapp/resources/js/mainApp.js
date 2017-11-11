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
	.when('/buildings', {
		templateUrl: 'resources/pages/buildings.jsp',
		controller: 'buildingsCtrl'
	})
	.when('/transportation', {
		templateUrl: 'resources/pages/transportation.jsp',
		controller: 'transportationCtrl'
	})
	.when('/contracting', {
		templateUrl: 'resources/pages/contracting.jsp',
		controller: 'contractingCtrl'
	})
	.when('/quantitysurveying', {
		templateUrl: 'resources/pages/quantitysurveying.jsp',
		controller: 'quantitysurveyingCtrl'
	})
	.when('/projectmanagement', {
		templateUrl: 'resources/pages/projectmanagement.jsp',
		controller: 'projectmanagementCtrl'
	})
	.when('/dneservices', {
		templateUrl: 'resources/pages/dneservices.jsp',
		controller: 'dneservicesCtrl'
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
.controller('dneservicesCtrl', function($scope){
	
})
.controller('aboutusCtrl', function($scope){
	
})
.controller('buildingsCtrl', function($scope){
	
})
.controller('transportationCtrl', function($scope){
	
})
.controller('transportationCtrl', function($scope){
	
})
.controller('projectmanagementCtrl', function($scope){
	
});
function AppCtrl($scope) {
    $scope.currentNavItem = 'page1';
  }
