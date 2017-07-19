'use strict';

app.controller('ProjectController', [
				'$scope',
				'$mdToast',
				'ProjectService',
				function AppCtrl($scope,$mdToast, ProjectService){
					// Code to call REST API (Java Rest Controller)
					
					$scope.addProject = function addProject(){
						var project = {
								"projectName" : $scope.project.name,
								"projectDesc" : $scope.project.desc
							};
						/*alert(project);*/
						var response = ProjectService.addProject(project);
						//alert("In Project Controller" + project);
					}
					
				}
			]

);