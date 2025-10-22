package com.jspiders.exceptions;

class InvalidMobileNumberException extends RuntimeException {
	InvalidMobileNumberException(){
		
	}
	InvalidMobileNumberException(String msg){
		super(msg);
	}
}
class PhoneNumberVerifier{
	static void verifyNumber(String mobile) {
		if(mobile.length() != 10) {
			throw new InvalidMobileNumberException("Invalid Number");
		}
	}
}
public class Mainclass10 {
	public static void main(String[] args) {
		try {
			PhoneNumberVerifier.verifyNumber("6554854866");
			System.out.println("Valid Number");
		} catch (InvalidMobileNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
