package com.jspiders.example;
class Student1{
	String name = "Rishav";
}
class Student2{
	String name = "Rishav";
	@Override
	public String toString() {
		return "Student Name: " + name;	
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Student1 obj = new Student1();
		System.out.println(obj);
		
		Student2 ref = new Student2();
		System.out.println(ref);
	}

}