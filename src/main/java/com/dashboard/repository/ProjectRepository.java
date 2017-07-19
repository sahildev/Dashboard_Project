package com.dashboard.repository;

import java.util.List;

import com.dashboard.entity.Project;

public interface ProjectRepository {

	List<Project> findAllProjects();
	
	Project findProject(int projectId);
	
}
