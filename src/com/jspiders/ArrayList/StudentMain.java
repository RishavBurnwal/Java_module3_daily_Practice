package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rishav", 23);  // Student class
		Student s2 = new Student(2, "Prince", 24);
		Student s3 = new Student(3, "Ajay", 22);
		
		ArrayList<Student> al = new ArrayList();  // <> --> this is known as generics 
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Student s = (Student)i.next();
			
			if(s.id == 3) {
				System.out.println(s);
			}
		}
		
	}

}
