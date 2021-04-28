package com.wolken.wolkenapp;

import java.util.*;
import java.io.*;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.age == o.age) // student2(age) == student1(age)
			return 1;
		return 0;
	}

}

