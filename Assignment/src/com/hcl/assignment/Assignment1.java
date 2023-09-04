package com.hcl.assignment;

import java.util.Scanner;


public class Assignment1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//reverse string
		String s;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a string");
		s=scanner.nextLine();
		for(int i=s.length(); i>0; --i) {
		System.out.print(s.charAt(i-1));
	
		}
		
	   //factorial number
		int fact = 1;
		int j = 1;
	
		int num = 3;
		while(j <= num ) {    
			fact=fact*j;
			j++;	
		
	}
		System.out.println("\nfactorial of "+ num + "is:" +fact);
		
		
		//OddExceptionNumber
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a number : ");
	        int num2 = sc.nextInt();

	    try {
	        if (num2 % 2 != 0) throw (new OddNumberException());
	        else System.out.println(num2 + " is an Even Number");
	        }

	        catch(OddNumberException e) {
	        System.out.println("The number is " + e.getMessage());
	        }
	    
	    
	    
	    try (//StudentGrades using switch case and ladder ifelse
		Scanner sc1 = new Scanner(System.in)) {
		}

		System.out.println("***Enter Students Grades***");
		System.out.println("Grade - A : Excellent job..!");
		System.out.println("Grade - B : Good job!");
		System.out.println("Grade - C : Average job.");
		System.out.println("Grade - D : Needs improvent.");
		System.out.println("Grade - F : Failed.");
		System.out.println("Invalid Grade");
		System.out.println("Enter the key:");
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			System.out.println("Grade - A : Excellent job..!");

			break;

		case 2:
			System.out.println("Grade - B : Good job..!");

			break;
		case 3:
			System.out.println("Grade - C : Average job.");

			break;
		case 4:
			System.out.println("Grade - D : Needs improvent.");

			break;
		case 5:
			System.out.println("Grade - F : Failed.");

			break;

		default:
			System.out.println("Invalid Grade");

			break;
		}

		System.out.println("Enter the key1:");
		String key1 = scanner.next();

		if (key1.equals("A")) {
			System.out.println("Excellent job");
		}
		else if (key1.equals("B"))
			System.out.println("Good job");

		else if (key1.equals("C"))
			System.out.println("Average job");

		else if (key1.equals("D"))
			System.out.println("Needs Improvement");

		else if (key1.equals("F"))
			System.out.println("Fail..!");

		else
			System.out.println("Invalid Grade");

	

	}
		
		
} 



