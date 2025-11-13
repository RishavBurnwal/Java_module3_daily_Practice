package com.jspiders.ArrayList;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rishav", 23, "Developer");
		Employee e2 = new Employee(2, "Rohit", 25, "Tester");
		Employee e3 = new Employee(1, "Sayan", 23, "Cloud engineer");
		Employee e4 = new Employee(1, "Raj", 23, "Analyst");
		
		ArrayList<Employee> al = new ArrayList();
		al.add(e1);
		al.add(e2);
		System.out.println(al);
		
		for(Object o : al) {  // for each loop
			System.out.println(o);
		}
	}

}
