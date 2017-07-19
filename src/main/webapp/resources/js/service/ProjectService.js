'use strict';

angular.module('myApp.services',['ngResource'])
		.factory('ProjectService', function($resource, $http){
	var factory = {
			addProject: function(project) {
				var url ='/dashboard/rest/project/add';
				/*return $http.post(url, project);*/
				return $http({
			          method: 'POST',
			          url: '/dashboard/rest/project/add',
			          params: {url:url, project:project}
			          /*headers: 'Accept:application/json'*/
			        });
			}
	}
	return factory;
});