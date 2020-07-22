package com.hazelcast.client;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelClientApp {
    public static void main(String n[]) {
    	HazelcastInstance client = null;
    	
    			try {
    				client = HazelcastClient.newHazelcastClient();
    				IMap<Long,String> map=client.getMap("customers");
    				System.out.println(map.get(1));
    			}
    	        finally {
    	        	client.shutdown();
    	        }
    }
}
