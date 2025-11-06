package com.jspiders.exceptions;

public class Mainclass4 {
	public static void main(String[] args) {
		try {
			System.out.println("try starts");
			System.out.println(10/0);
			System.out.println("try starts");
		}
		catch(ArithmeticException e){
			System.out.println("divided by zero");
		}
		finally {
			System.out.println("Executing finally block");
		}
	}
}



