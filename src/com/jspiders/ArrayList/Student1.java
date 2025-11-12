package com.jspiders.ArrayList;

public class Student1 {
	Integer id;
	String name;
	Double marks;
	
	public Student1(Integer id, String name, Double marks ) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
