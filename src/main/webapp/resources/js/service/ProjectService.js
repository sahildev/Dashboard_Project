'use strict';

angular.module('myApp.services',['ngResource'])
		.factory('ProjectService', function($resource, $http){
	var factory = {
			addProject: function(user) {
				var url ='/dashboard/rest/project/add';
				return $http.post(url, user);
			}
	}
	return factory;
});