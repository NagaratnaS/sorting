package com.wolken.wolkenapp;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Nagaratna", 21);
		Student student2 = new Student(2, "Shree", 20);
		System.out.println(student2.compareTo(student1));
	}
}
