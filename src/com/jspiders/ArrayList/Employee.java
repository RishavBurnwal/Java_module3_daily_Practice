package com.jspiders.ArrayList;

import java.util.ArrayList;

public class Employee {
		int id;
		String name;
		int age;
		String role;
		
		public Employee(int id, String name, int age, String role) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.role = role;
		}

		@Override
		public String toString() {
			return "Employee [, id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + "]";
		}
		
		

}
