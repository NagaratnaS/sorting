package com.wolken.wolkenapp;

import java.util.Comparator;

public class CollegeNumberComparator implements Comparator<College>{

	@Override
	public int compare(College o1, College o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCollegenumber(), o2.getCollegenumber());
	}

}
