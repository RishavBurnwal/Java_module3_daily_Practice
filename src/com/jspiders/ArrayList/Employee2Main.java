package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee2Main {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1, "Rishav", 36900.0);
		Employee2 e2 = new Employee2(3, "Rohit", 55700.0);
		Employee2 e3 = new Employee2(2, "raj", 45420.0);
		
		ArrayList<Employee2> al = new ArrayList<Employee2>();
		al.add(e3);
		al.add(e2);
		al.add(e1);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Employee2 e = (Employee2)i.next();
			
			if(e.salary>40000) {
				System.out.println(e);
			}
			
		}
		
		
	}

}
