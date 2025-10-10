package com.jspiders.example;

class Employee{
	int eid=101;
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.eid == e.eid) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass5 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println(e1.equals(e2));
	}
}
