package com.student.manage;

import java.util.Comparator;

public class SortStdByMarks implements Comparator<Student> {
	
	@Override
	public int compare(Student x,Student y) {
		Double i=x.getMarks();
		Double j=y.getMarks();
		return i.compareTo(j);
	}
}