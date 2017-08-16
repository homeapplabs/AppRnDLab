var mainapp = angular.module("myModule", ['ngMaterial'])
.controller('AppCtrl', AppCtrl);

function AppCtrl($scope) {
    $scope.currentNavItem = 'page1';
  }


/*mainApp.config(function($routeProvider) {
    $routeProvider.caseInsensitiveMatch=true;
    $routeProvider
        .when('/index', {
            templateUrl: '/AngularSpring/resources/userRegister.html',
            controller: 'registerController'
        })
        .when('/login', {
            templateUrl: '/HomeSolution/resources/pages/Login.html',
            controller: 'loginController'
        })
        .when('/registration', {
            templateUrl: '/HomeSolution/resources/pages/customerRegistration.html',
            controller: 'registrationController'
        })
        .when('/forgotPwd', {
            templateUrl: '/HomeSolution/resources/pages/forgotPassword.html',
            controller: 'forgotPwdController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});*/