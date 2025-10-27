package com.jspiders.exceptions;

//public class Mainclass4 {
//	public static void main(String[] args) {
//		try {
//			System.out.println("try starts");
//			System.out.println(10/0);
//			System.out.println("try starts");
//		}
//		catch(ArithmeticException e){
//			System.out.println("divided by zero");
//		}
//		finally {
//			System.out.println("Executing finally block");
//		}
//	}
//}

public class Mainclass4 {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("A");
		System.out.println(buffer.toString());
		System.out.println(buffer.hashCode());
		
		StringBuilder builder = new StringBuilder("a");
		System.out.println(builder.toString());
		System.out.println(builder.hashCode());
	}
}

