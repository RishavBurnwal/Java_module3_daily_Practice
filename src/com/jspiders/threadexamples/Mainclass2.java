package com.jspiders.threadexamples;

class SampleThread implements Runnable{
	@Override
	public void run() {
		for(int a=1;a<=5; a++) {
			System.out.println("Sample Thread...");
		}
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		SampleThread st = new SampleThread();
		Thread th = new Thread(st);
		th.start();
		for(int a=1;a<=5; a++) {
			System.out.println("Main Thread...");
		}
		System.out.println("Program Ends");
	}

}
