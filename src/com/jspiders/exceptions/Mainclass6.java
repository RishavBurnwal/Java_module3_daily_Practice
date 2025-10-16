package com.jspiders.exceptions;

class Demo1{
	void test() {
		System.out.println("Executing test()...");
	}
}
public class Mainclass6 {
	static void instantiate() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Demo1 ref = (Demo1)Class.forName("com.jspiders.exception.Demo1").newInstance();
		ref.test();
	}
	public static void main(String[] args) {
		try {
			instantiate();
		}
		catch(ClassNotFoundException|IllegalAccessException|InstantiationException e) {
			System.out.println(e.getClass());
		}
	}

}
