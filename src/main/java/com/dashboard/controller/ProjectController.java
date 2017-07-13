package com.dashboard.controller;

import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest/project")
public class ProjectController {

	/*@RequestMapping("/")
	private String home() {
		return "index";
	}*/
	
	@RequestMapping(value = "/add", method = {RequestMethod.POST})
	private String addProject(@RequestBody HttpRequest user) {
		
		System.out.println("Request Params : " + user);
		
		return null;
	}
	
}
