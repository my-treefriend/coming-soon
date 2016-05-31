package com.treefriend.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class LandingPageController {
	
	@RequestMapping("/")
    
	public ModelAndView landing() {
        return new ModelAndView("index");
    }
}
