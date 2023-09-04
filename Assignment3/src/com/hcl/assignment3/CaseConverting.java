package com.hcl.assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConverting {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("C", "java", "python", "javaScript", "dbms");

		System.out.println("The given list:" + str);

		List<String> uppercaseStrings = str.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("\nUppercase Strings: " + uppercaseStrings);

		List<String> lowercaseStrings = str.stream().map(String::toLowerCase).collect(Collectors.toList());

		System.out.println("Lowercase Strings: " + lowercaseStrings);

	}

}
