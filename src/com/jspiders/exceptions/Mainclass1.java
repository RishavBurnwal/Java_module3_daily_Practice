package com.jspiders.exceptions;

public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero");
		}
		System.out.println("Program Ends");
	}

}
