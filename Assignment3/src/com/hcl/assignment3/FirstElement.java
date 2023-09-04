package com.hcl.assignment3;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(0, 9, 8, 7, 6, 5, 4, 3, 2, 1);

		System.out.println("The given list" + list);

//		list.stream().findFirst().ifPresent(System.out::println);

		System.out.println( list.stream().max(Integer::compare).get());
	}	
	
}
