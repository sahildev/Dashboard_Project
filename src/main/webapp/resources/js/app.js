'use strict';

var app = angular.module('myApp', [ 'ngMaterial', 'ngRoute' ]);

app.config(function($routeProvider) {

	$routeProvider

	.when('/', {
		templateUrl : 'home.html',
		controller : 'HomeController'
	})

	.when('/help', {
		templateUrl : 'Help.html',
		controller : 'HelpController'
	})

	.when('/settings', {
		templateUrl : 'Settings.html',
		controller : 'SettingsController'
	})

	.when('/profile', {
		templateUrl : 'profile.html',
		controller : 'ProfileController'
	})
	
	.when('/addProject', {
		templateUrl : 'AddProject.html',
		controller : 'ProjectController'
	})

	.otherwise({
		redirectTo : '/'});
});

app.controller('HomeController', function($scope) {
	$scope.message = 'Hello from HomeController';
});

app.controller('ProfileController', function($scope) {
	$scope.message = 'Hello from ProfileController';
});

app.controller('SettingsController', function($scope) {
	$scope.message = 'Hello from Settings';
});

app.controller('HelpController', function($scope) {
	$scope.message = 'Hello from HelpController';
});