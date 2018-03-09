package com.rahul.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String silly() {
		return "helloworld";
	}
	
}
