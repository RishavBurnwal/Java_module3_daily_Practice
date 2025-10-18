package com.jspiders.exceptions;
class OverSpeedException extends Exception{  //using checked exception
	OverSpeedException(){
		
	}
	OverSpeedException(String msg){
		super(msg);
	}
}
class Police{
	static void checkspeed(int speed) throws OverSpeedException{
		if(speed>80) {
			throw new OverSpeedException("Overspeed Fine Added");
		}
	}
}
public class Mainclass9 {
	public static void main(String[] args) {
		try {
			Police.checkspeed(60);
			Police.checkspeed(50);
			Police.checkspeed(70);
			Police.checkspeed(110);
		}
		catch(OverSpeedException e) {
			System.out.println(e.getMessage());
		}
	}
}
