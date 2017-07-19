package com.dashboard.controller;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
	private String addProject(@RequestBody String project) {

		System.out.println("Request Params : " + project);
		Gson gsonObject = new Gson();
		Type type = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> myMap = gsonObject.fromJson(project, type);
		System.out.println("myMap : " + myMap);
		return "/addProject";
	}

}
