package com.hcl.assignment2;

import java.time.YearMonth;
import java.util.Scanner;

public class EnumMonthExample {


	public enum Month{January,Feburary,March,April,May,June,July,August,September,October,November,December}
	
	
	public void enumMonth() {
		
		for (Month month : Month.values()) {
			System.out.println(month);
		}
		
		int year = 2023;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Month:");
			int month = sc.nextInt();
			
			YearMonth yearMonth = YearMonth.of(year, month);
			int daysInMonth = yearMonth.lengthOfMonth();
			
			System.out.println("Number of days in " + yearMonth.getMonth() + ":" +daysInMonth);
		}
	}
	
}
