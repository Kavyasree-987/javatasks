package com.hcl.assignment3;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(1);
		num.add(3);
		num.add(8);
		num.add(5);
		num.add(7);
		num.add(2);
		num.add(8);

		List<Integer> uniqueNum = num.stream().distinct().collect(Collectors.toList());

		System.out.println("The Given List:" + num);
		System.out.println("After Removing the duplicates from the list:" + uniqueNum);

	}
}
