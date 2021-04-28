package com.wolken.wolkenapp;

import java.util.Comparator;

public class CollegeNameComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		// TODO Auto-generated method stub
		return o1.getCollegeName().compareTo(o2.getCollegeName());
	}

}

