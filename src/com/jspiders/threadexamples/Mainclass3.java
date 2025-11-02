package com.jspiders.threadexamples;

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Thread th = Thread.currentThread();
		System.out.println("ID : "+ th.getId());
		System.out.println("Name : "+ th.getName());
		System.out.println("Priority : "+ th.getPriority());
		System.out.println("Program Ends");
	}

}
