package com.jspiders.exceptions;

class InvalidPinCodeException extends Exception{
	InvalidPinCodeException(){
		
	}
	InvalidPinCodeException(String msg){
		super(msg);
	}
}
class PinCodeVerifier{
	static void verifyPin(String pin) throws InvalidPinCodeException {
		if(pin.length() != 6) {
			throw new InvalidPinCodeException("Wrong Pin Code");
		}
	}
}
public class Mainclass11 {
	public static void main(String[] args) {
		try {
			PinCodeVerifier.verifyPin("544554");
			PinCodeVerifier.verifyPin("64654");
		}
		catch(InvalidPinCodeException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
