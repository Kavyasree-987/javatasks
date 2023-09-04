package com.hcl.assignment3;

import java.util.Arrays;
import java.util.List;

public class TotalElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 9, 8, 7, 6, 5, 4, 3, 2, 1);

		System.out.println("The given list" + list);

		long count = list.stream().count();

		System.out.println(count);

	}
}
