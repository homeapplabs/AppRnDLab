/**
 * Created by Abhimanyu.1.Singh on 3/21/2016.
 */

var mainApp = angular.module("myHomeApp",["ngRoute","ngMaterial","ngMessages"]);

mainApp.config(function($routeProvider) {
    $routeProvider.caseInsensitiveMatch=true;
    $routeProvider
        .when('/index', {
            templateUrl: '/HomeSolution/resources/pages/Login.jsp',
            controller: 'loginController'
        })
        .when('/login', {
            templateUrl: '/HomeSolution/resources/pages/Login.jsp',
            controller: 'loginController'
        })
        .when('/registration', {
            templateUrl: '/HomeSolution/resources/pages/customerRegistration.jsp',
            controller: 'registrationController'
        })
        .when('/test', {
            templateUrl: '/HomeSolution/resources/pages/Test.jsp',
            controller: 'testController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});

/*mainApp.controller("mainCtrl", function($scope,$mdDialog){
    $scope.submitForm = function() {

        // check to make sure the form is completely valid
        if ($scope.userForm.$valid) {
            alert('our form is amazing');
        }

    };


    $scope.showPrompt = function(ev) {
        // Appending dialog to document.body to cover sidenav in docs app
        var confirm = $mdDialog.prompt()
            .title('What would you name your dog?')
            .textContent('Bowser is a common name.')
            .placeholder('dog name')
            .ariaLabel('Dog name')
            .targetEvent(ev)
            .ok('Okay!')
            .cancel('I\'m a cat person');
        $mdDialog.show(confirm).then(function(result) {
            $scope.status = 'You decided to name your dog ' + result + '.';
        }, function() {
            $scope.status = 'You didn\'t name your dog.';
        });
    };
});*/

 mainApp.controller("dateCtlr", function($scope){
     $scope.myDate = new Date();
     $scope.retDate;
     $scope.depDate = new Date(
         $scope.myDate.getFullYear(),
         $scope.myDate.getMonth(),
         $scope.myDate.getDate());

     /*$scope.retDate = new Date(
         $scope.myDate.getFullYear(),
         $scope.myDate.getMonth(),
         $scope.myDate.getDate());*/

     $scope.ppDOB = new Date(
         $scope.myDate.getFullYear() - 12,
         $scope.myDate.getMonth(),
         $scope.myDate.getDate());
 });

