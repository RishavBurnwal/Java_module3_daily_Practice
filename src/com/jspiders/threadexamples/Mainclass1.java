package com.jspiders.threadexamples;

class DemoThread extends Thread{
	@Override
	public void run() {
		for(int a=1 ; a<=5 ; a++) {
			System.out.println("demo thread...");
		}
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		DemoThread dt = new DemoThread();
		dt.start();
		for(int a=1 ; a<=5 ; a++) {
			System.out.println("main thread...");
		}
		System.out.println("Program Ends");
	}

}
