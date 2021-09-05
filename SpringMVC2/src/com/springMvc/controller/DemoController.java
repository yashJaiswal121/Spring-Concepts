package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/xyz")
public class DemoController {
	
	@RequestMapping("/test")
	public String getTestMapping() {
		return "test";
	}
}
