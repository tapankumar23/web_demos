package com.tap.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tap.BackendApplication;
import com.tap.backend.service.aop.ShapeService;

@RestController
@RequestMapping("/ims")
public class TestController {

	@RequestMapping(value="/test", method=RequestMethod.GET) 
	public String test() {
		
		ShapeService shapeService  =(ShapeService) BackendApplication.applicationCtxt.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		
		return "Welcome ims it works !!!";
	}
}

