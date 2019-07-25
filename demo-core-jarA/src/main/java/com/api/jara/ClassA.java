package com.api.jara;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClassA {

	@GetMapping("callA")
	public String methodA() {
		return "Hello, This is methodA from ClassA";
	}
	
}
