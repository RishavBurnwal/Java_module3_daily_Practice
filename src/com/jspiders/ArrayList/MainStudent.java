package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rishav", 23);  // Student class
		Student s2 = new Student(2, "Prince", 24);
		
		ArrayList<Student> al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(new Student(3, "Ajay", 22));
		
		Collections.sort(al, new SortByIdAsc());
			for(Student s : al) {
				System.out.println(s);
			}

		
		Collections.sort(al, new SortByIdDesc());
			for(Student s : al) {
				System.out.println(s);
			}

		
		Collections.sort(al, new SortByNameDesc());
			for(Student s : al) {
				System.out.println(s);
			}
	}

}
