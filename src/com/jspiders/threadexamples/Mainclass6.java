package com.jspiders.threadexamples;

public class Mainclass6 {
	public static void main(String[] args) {
		Resource ref = new Resource();
		Thread t1 = new Thread(new ConsumerThread(ref));
		t1.setName("tessaract");
		Thread t2 = new Thread(new ConsumerThread(ref));
		t2.setName("kryptonite");
		t1.start();
		t2.start();
		
	}
}
