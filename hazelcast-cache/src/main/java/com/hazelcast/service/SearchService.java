package com.hazelcast.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
	
	@Cacheable("items")
	public String getItem(String item) {
		return SearchItem(item);
	}
	
	
	public String SearchItem(String item) {
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "processed " +item;
	}

}
