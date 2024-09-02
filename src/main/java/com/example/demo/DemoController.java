package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
 class DemoController {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to demo application";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello to demo application";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting to demo application";
	}

}
