package com.hcl.assignment3;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestSmallest {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10, 20, 40, 60, 30, 50, 20, 70, 80);

		System.out.println("The Given List:" + num);

		Optional<Integer> secondSmallest = num.stream().distinct().sorted().skip(1).findFirst();

		Optional<Integer> secondLargest = num.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println("secondSmallest:" + secondSmallest);

		System.out.println("secondLargest:" + secondLargest);

	}
}