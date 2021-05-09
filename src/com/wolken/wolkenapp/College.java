package com.wolken.wolkenapp;

import java.util.Comparator;

public class College  {

	private int collegeNumber;
	private String collegename;
	public int getCollegenumber() {
		return collegenumber;
	}
	@Override
	public String toString() {
		return "College [collegenumber=" + collegenumber + ", collegeName=" + collegeName + "]";
	}
	public College(int collegenumber, String collegeName) {
		super();
		this.collegenumber = collegenumber;
		this.collegeName = collegeName;
	}
	public void setCollegenumber(int collegenumber) {
		this.collegenumber = collegenumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
