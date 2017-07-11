'use strict';

angular.module('myApp.services',['ngResource'])
		.factory('ProjectService', function($resource, $http){
	var factory = {
			addProject: function() {
				var url ='/addProject';
				return $http.get(url);
			}
	}
	return factory;
});