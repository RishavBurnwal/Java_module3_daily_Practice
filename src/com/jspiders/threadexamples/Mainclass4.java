package com.jspiders.threadexamples;

class ExampleThread implements Runnable{
	@Override
	public void run() {
		for(int a=1 ; a<=5 ; a++) {
			Thread th = Thread.currentThread();
			System.out.println("ID : "+ th.getId() + "Name : "+ th.getName() + "Priority : "+ th.getPriority());
		}
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ExampleThread());
		t1.setName("jspiders");
		t1.setPriority(5);
		Thread t2 = new Thread(new ExampleThread());
		t2.setName("qspiders");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
