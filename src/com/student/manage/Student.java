package com.student.manage;

public class Student {
	 private int id; 
	  private String name;
	  private double marks;
	  
	  Student(int id,String name,double marks){
		  this.id=id;
		  this.name=name;
		  this.marks=marks;
	  }
	  
	  public int getId() {
		  return id;
	  }
	  public String getName(){
		  return name;
	  }
	  public double getMarks() {
		  return marks;
	  }
	  
	  @Override
	  public String toString() {
		  return ("Student id : "+id+ " Student name : "+name+ " Student Marks : "+marks);
	  }
}
