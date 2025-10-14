package com.jspiders.exceptions;

public class Mainclass2 {
	public static void main(String[] args) {
		String str = "Java";
		try {
			System.out.println(str.charAt(7));
		}
		catch(NullPointerException e) {
			System.out.println("Alert : Operation with null");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Alert :  Invalid Index");
		}
	}

}
