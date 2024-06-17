package com.example.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("info", "Spring Boot EC2 Docker");
		return object;
	}
}
