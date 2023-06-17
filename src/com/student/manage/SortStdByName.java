package com.student.manage;


import java.util.Comparator;

public class SortStdByName implements Comparator<Student>{
	
	@Override
	public int compare(Student x,Student y) {
		return x.getName().compareTo(y.getName());
	}
}