package com.api.jarb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClassB {

	@GetMapping("callB")
	public String methodB() {
		return "Hello, This is methodB from ClassB";
	}
	
}
