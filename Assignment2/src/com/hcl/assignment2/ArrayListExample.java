package com.hcl.assignment2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayListExample obj = new ArrayListExample();
		 
		LinkedListExample obj2 = new  LinkedListExample();
		
		HashMapExample obj3 = new HashMapExample();
		
		EnumMonthExample obj4 = new EnumMonthExample();
		
		obj.ArrayList();
		obj2.LinkedList();
		obj3.HashMap();
		obj4.enumMonth();

	}

	private void ArrayList() {
		
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		    
		 
		  arr.add(1);
		  arr.add(2);
		  arr.add(3);
		  arr.add(5);
		  arr.add(6);
		  System.out.println(arr);
		  
		  int i=0;
		   for(int number : arr){
			   
			   i += number;
		   }
		    System.out.println("The sum of the ArrayList is :" +i);	   
		   
		    
	}
	
}

	
	
	
	

