'use strict';

app.controller('ProjectController', [
				'$scope',
				'$mdToast',
				'ProjectService',
				function AppCtrl($scope,$mdToast, ProjectService){
					// Code to call REST API (Java Rest Controller)
					
					$scope.addProject = function addProject(){
						var user = {
								"userFirstName" : $scope.user.firstName,
								"userLastName" : $scope.user.lastName
							};
						//alert(user);
						var response = ProjectService.addProject(user);
						//alert("In Project Controller" + user);
					}
					
				}
			]

);