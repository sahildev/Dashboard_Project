package com.dashboard.repository;

import java.util.ArrayList;
import java.util.List;

import com.dashboard.entity.Project;

public class ProjectRepositoryStub implements ProjectRepository {

	@Override
	public List<Project> findAllProjects() {

		List<Project> project = new ArrayList<Project>();
		
		Project project1 = new Project();
		project1.setProjId(1);
		project1.setProjName("project1");
		project1.setProjDesc("desc for project 1");
		
		project.add(project1);
		return project;
	}

	@Override
	public Project findProject(int projectId) {

		Project project1 = new Project();
		project1.setProjId(2);
		project1.setProjName("project2");
		project1.setProjDesc("desc for project 2");
		
		return project1;
	}

}
