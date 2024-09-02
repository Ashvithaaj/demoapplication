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

}
