package com.hcl.assignment3;

import java.util.Arrays;
import java.util.List;

public class ElementsStartsWith1 {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList( 1,5,10,20,110,30 );
		
		System.out.println("The given list"+list);	
			
		list.stream().map(str -> str+"").filter(str -> str.startsWith("1")).forEach(System.out::println);
	}

}
