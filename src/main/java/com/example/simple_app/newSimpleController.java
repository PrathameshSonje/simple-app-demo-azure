package com.example.simple_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class newSimpleController{

	@GetMapping("/new")
	public String welcome() {
		return "welcome to word of DevOps";
	}
}
