package com.hcl.assignment3;

import java.util.Arrays
;
import java.util.List;


public class ListAverage {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("List of numbers:" + num);

		Double avg = num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

		System.out.println("The average value of numbers:" + avg);

	}

}
