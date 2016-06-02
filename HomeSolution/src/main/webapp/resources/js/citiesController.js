/**
 * Created by abhimanyu.1.singh on 4/4/2016.
 */

mainApp.controller("citiesController", function($scope, $http){
    var url = "/HomeSolution/resources/json/cities.json";
    $http.get(url).success(function(response){
        $scope.cities= response;
    });

    $scope.selectedCity;
    $scope.getSelectedCity = function() {
        if ($scope.selectedCity !== undefined) {
            return $scope.selectedCity;
        } else {
            return "Select a City";
        }
    };
});