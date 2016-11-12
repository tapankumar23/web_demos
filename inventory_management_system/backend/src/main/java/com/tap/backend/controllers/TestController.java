package com.tap.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/ims")
public class TestController {

	@RequestMapping(value="/test", method=RequestMethod.GET) 
	public String test() {
		return "Welcome ims it works !!!";
	}
}

