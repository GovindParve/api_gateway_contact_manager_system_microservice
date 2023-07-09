package com.in.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@RequestMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User service is down at this time !!";
	}
	
	@RequestMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "Contact service is down at this time !!";
	}

}
