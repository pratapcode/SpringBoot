package com.pratap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Shiv Pratap!";
	}

}
