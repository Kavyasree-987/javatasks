package com.hcl.assignment3;


import java.util.ArrayList;
import java.util.List;

public class StreamsEven {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
	
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0);
		list.add(8);
		
		System.out.println("List of numbers:" + list);
		
		list.stream().filter(n -> n % 2==0).forEach(System.out::println);
		
		
	}

}
