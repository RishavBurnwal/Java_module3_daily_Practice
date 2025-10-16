package com.jspiders.exceptions;
public class Mainclass7 {
	static void test() {
		System.out.println("test starts");
		System.out.println(10/0);
		System.out.println("test ends");
	}
	static void disp() {
		System.out.println("disp starts");
		test();
		System.out.println("disp ends");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		disp();
		System.out.println("main ends");
	}
}
