package com.springMvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormProcessingDemo {
	
	@GetMapping("/request/{formName}")
	public String getForm(@PathVariable("formName") final String formName) {
		return formName;
	}
	
	@RequestMapping("/request/processName")
	public String formParamProcessing(HttpServletRequest request) {
		
		String personName = request.getParameter("personName");
		System.out.println("The person name entered at UI :: " +personName);
		return "formDemo2";
	}
	
	@RequestMapping("/request/processName/version2")
	public String formProcessingV2(HttpServletRequest request,Model model) {
		
		String personName = request.getParameter("personName");
		System.out.println("The person name entered at UI :: " +personName);
		
		String message = "Yo "+personName.toUpperCase();
		model.addAttribute("message", message);
		return "formDemo3";
	}
	
}
