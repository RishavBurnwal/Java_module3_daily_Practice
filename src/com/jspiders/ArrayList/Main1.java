package com.jspiders.ArrayList;

import java.util.ArrayList;
//Main1 class
public class Main1{
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rishav", 23);  // Student class
		Student s2 = new Student(2, "Prince", 24);
		
		ArrayList<Student> al = new ArrayList();  // <> --> this is known as generics 
		al.add(s1);
		al.add(s2);
		al.add(new Student(3, "Ajay", 22));
		System.out.println(al);
	}
}
