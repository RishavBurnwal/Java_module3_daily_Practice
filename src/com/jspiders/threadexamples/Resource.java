package com.jspiders.threadexamples;

public class Resource {
	synchronized void play() {
		for(int a=1 ; a<=5 ; a++) {
			Thread th = Thread.currentThread();
			System.out.println(a + "Thread Name : "+ th.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
