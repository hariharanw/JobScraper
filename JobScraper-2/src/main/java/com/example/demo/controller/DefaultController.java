package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	 @RequestMapping("/index.html")
	    public String defaultPage() {
	        return "index";
	    }
	 @RequestMapping("/jobs.html")
	    public String defaultPage2() {
	        return "jobs";
	    }
	
}
