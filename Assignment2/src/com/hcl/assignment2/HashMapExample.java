package com.hcl.assignment2;

import java.util.HashMap;


public class HashMapExample {
	
	public void HashMap() {
		
		HashMap<String,String> map = new HashMap<String,String>();


		 map.put("C", "Shivani");
		 map.put("A","Kavya");
		 map.put("B","Anusha");
		 map.put("F","Ram");
		 map.put("F","Joe");
		 map.put("A", "Usha");
		 
		 System.out.println(map);
		 
		 map.remove("F");
		
		 System.out.print("After Removing Low Grade:" +map);
		
		 
	}
	
	
}
