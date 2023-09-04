package com.hcl.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	
	public static void main(String[] args) {
		
		
		ArrayList<Student> List = new ArrayList<Student>();
		
		List.add(new Student("Divya",20, 9));
		List.add(new Student("Kavya",21, 8));		
		List.add(new Student("Ram",22, 9));
		List.add(new Student("Usha",20, 7));
		List.add(new Student("Shiva",21, 8));
		
		Collections.sort(List);
		
		System.out.println("Student details after sorting..");
		for(Student st:List) {
			
			System.out.println(st.getName()+"  "+st.getAge()+"  "+st.getGrade());
			
		}
		
		
	}

	
	
}
