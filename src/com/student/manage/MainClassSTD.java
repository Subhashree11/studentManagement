package com.student.manage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClassSTD {
	public static void main(String[] args) {
		Student s1=new Student(101,"Subha",65);
		Student s2=new Student(102,"shree",67);
		Student s3=new Student(103,"Das",76);

		Map<Integer,Student> map=new LinkedHashMap<Integer,Student>();
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		
		Set<Integer> keys=map.keySet();
		for(int key : keys) {
			System.out.println(map.get(key));
		}
	}
}
