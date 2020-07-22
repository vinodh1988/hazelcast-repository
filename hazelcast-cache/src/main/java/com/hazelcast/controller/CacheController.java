package com.hazelcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hazelcast.service.SearchService;


@RestController
@RequestMapping("/api")
public class CacheController {

	@Autowired
	SearchService service;
	
	@RequestMapping("/hello")
	public String greet() {
		return "Hi!! Spring boot is running";
	}
	
	@RequestMapping("/search/{pattern}")
	public String searchItem(@PathVariable String pattern) {
		return service.getItem(pattern);
	
	}
}
