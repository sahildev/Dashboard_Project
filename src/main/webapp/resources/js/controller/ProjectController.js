'use strict';

app.controller(
			'ProjectController',
			[
				'$scope',
				'$mdToast',
				function AppCtrl($scope,$mdToast){
					
					alert("In Project Controller");
				}
			]

);