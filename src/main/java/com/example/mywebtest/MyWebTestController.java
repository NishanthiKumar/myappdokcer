package com.example.mywebtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebTestController {
	
	@GetMapping(value="/hi")
	public String print() {
		return "Helo ATR";
	}

}
