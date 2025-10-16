package com.jspiders.exceptions;

class Demo{
	void test() {
		System.out.println("Executing test()...");
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		try {
			Demo ref = (Demo)Class.forName("com.jspiders.exceptions.Demo").newInstance();
			ref.test();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		}
		catch (IllegalAccessException e) {
			System.out.println("Access denied");
		}
		catch (InstantiationException e) {
			System.out.println("Object Creation Failed");
		}
	}

}
