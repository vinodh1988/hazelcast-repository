package com.hazelcast.server;


import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelCastServer {
   public static void main(String n[]) {
	   HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
		Map<Integer,String> map = hazelcastInstance.getMap("customers");
    	map.put(1, "Ramesh");
    	map.put(2,  "Krishna");
   }
}
