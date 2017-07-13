package com.dashboard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest/project")
public class ProjectController {

	/*
	 * @RequestMapping("/") private String home() { return "index"; }
	 */

	@RequestMapping(value = "/add", method = { RequestMethod.POST, RequestMethod.GET })
	private Map<String,Object> addProject(@RequestBody Map<String,Object> user) {

		System.out.println("Request Params : " + user);
		Map<String,Object> addProject = new HashMap();
		return addProject;
	}

}
