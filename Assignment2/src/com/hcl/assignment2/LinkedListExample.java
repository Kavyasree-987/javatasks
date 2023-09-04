package com.hcl.assignment2;


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
	

	public void LinkedList() {
			
	
		LinkedList<String> list = new LinkedList<String>();
		
		  list.add("Ganga");
	      list.add("Yamuna");
	      list.add("Narmada");
	      
	      System.out.println(list);
		  
		Collections.reverse(list);
		 
		System.out.println("Reverse order of strings:" +list);
	}
	
	
}
