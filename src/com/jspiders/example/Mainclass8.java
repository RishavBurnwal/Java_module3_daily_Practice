package com.jspiders.example;

class Patient{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Object destroyed");
	}
}
public class Mainclass8 {
	public static void main(String[] args) {
		Patient obj = new Patient();
		System.gc();
		obj=null;
		System.gc();
	}

}
