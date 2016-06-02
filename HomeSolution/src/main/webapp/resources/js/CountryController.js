mainApp.controller("countriesController", function($scope, $http){
    var url = "/HomeSolution/resources/json/countries.json";
    $http.get(url).success(function(response){
        $scope.countries= response;
    });

    $scope.selectedCountry;
    $scope.getSelectedCountry = function() {
        if ($scope.selectedCountry !== undefined) {
            return $scope.selectedCountry;
        } else {
            return "Select a Country";
        }
    };
});