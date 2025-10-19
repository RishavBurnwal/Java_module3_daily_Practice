package com.jspiders.exceptions;

public class Mainclass13 {
	public static void main(String[] args) {
		System.out.println("program starts");
		String str = "Java";
		try {
			System.out.println(str.charAt(7));
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		System.out.println("Program Ends");
	}

}
