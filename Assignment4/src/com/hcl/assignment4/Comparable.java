package com.hcl.assignment4;

class Student implements Comparable<Student> {

	private String name;
	private int age;
	private int grade;

	Student(String name, int age, int grade) {
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);
	}

	@Override
	public int compareTo(Student st) {

		if (getAge() == st.getAge())

			return 0;

		else if (getAge() > st.getAge())
			return 1;

		else
			return -1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade2) {
		this.grade = grade2;
	}

}