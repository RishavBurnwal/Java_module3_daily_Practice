package com.jspiders.threadexamples;

public class Mainclass5 {
	public static void main(String[] args) {
		System.out.println("Program Startrs");
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}
		System.out.println("Program Ends");
	}

}
