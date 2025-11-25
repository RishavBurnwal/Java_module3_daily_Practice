package com.jspiders.ArrayList;

public class Employee2 {
	Integer id;
	String name;
	Double salary;
	
	public Employee2(Integer id, String name, Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
