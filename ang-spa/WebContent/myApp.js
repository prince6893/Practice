var app = angular.module("myApp",["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "index.html",
        controller : "myCtrl"
    })
    .when("/1", {
        templateUrl : "1.html",
        controller  : "ctrl1"
    })
    .when("/2", {
        templateUrl : "2.html",
        controller  : "ctrl2"
    })
    .when("/3", {
        templateUrl : "3.html",
        controller  : "ctrl3"
    })
   
});
