package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
	public static void main(String args[]) {
		College college1 = new College(1, "abc");
		College college2 = new College(5, "xyz");
		College college3 = new College(4, "def");
		College college4 = new College(9, "mno");
		
		List<College> list = new ArrayList<>();
		list.add(college1);
		list.add(college2);
		list.add(college3);
		list.add(college4);
		
		CollegeNumberComparator c1 = new CollegeNumberComparator();
		Collections.sort(list, c1);
		System.out.println(list);
	}

}
