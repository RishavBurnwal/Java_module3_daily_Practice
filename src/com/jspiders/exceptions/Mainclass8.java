package com.jspiders.exceptions;
class MyCustomException extends Exception{
	MyCustomException(){
		
	}
	MyCustomException(String msg){
		super(msg);
	}
}
class Trigger{
	static void verify(int num) throws MyCustomException{
		if(num % 2 == 0 && num % 3 == 0) {
			MyCustomException obj = new MyCustomException("Divisible by 2 & 3");
			throw obj;
		}
		else {
			System.out.println("All is well");
		}
	}
}
public class Mainclass8 {
	public static void main(String[] args) {
		try {
			Trigger.verify(10);
			Trigger.verify(15);
			Trigger.verify(12);
		}
		catch(MyCustomException e) {
			System.out.println("Exception occurred "+ e.getMessage());
		}
	}

}
