package com.moulali.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class HomeController {

	@GetMapping("/wish")
	public String wish() {
		return "Jenkins Demo with Spring boot application";
	}
}
