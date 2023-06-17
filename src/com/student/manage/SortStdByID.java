package com.student.manage;

import java.util.Comparator;

public class SortStdByID implements Comparator<Student>{
	
	@Override
	public int compare(Student x,Student y) {
		return x.getId()-y.getId();
	}
}