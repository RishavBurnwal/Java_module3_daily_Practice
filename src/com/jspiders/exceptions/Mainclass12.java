package com.jspiders.exceptions;
class HousefullException extends Exception{
	HousefullException() {
		
	}
	HousefullException(String msg) {
		super(msg);
	}	
}
class Theatre{
	static int ticketsLeft=3;
	static void buyTickets() throws HousefullException{
		if(ticketsLeft==0) {
			throw new HousefullException("No Tickets Available");
		}
		ticketsLeft--;
	}
}
public class Mainclass12 {
	public static void main(String[] args) {
		try {
			Theatre.buyTickets();
			Theatre.buyTickets();
			Theatre.buyTickets();
			Theatre.buyTickets(); //at this point means 4th time HousefullException happens
			Theatre.buyTickets(); //after 4th call no 
			Theatre.buyTickets();
		}
		catch(HousefullException e) {
			System.out.println(e.getMessage());
		}
	}
}
