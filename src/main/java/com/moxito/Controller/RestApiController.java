package com.moxito.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test1(HttpServletRequest req) {
		return "Hello Mohit";
	}

}
