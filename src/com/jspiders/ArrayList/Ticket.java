package com.jspiders.ArrayList;

public class Ticket implements Comparable{
	long pnr ;
	Double price;
	String from;
	String to;
	String date;
	
	public Ticket(long pnr , double price, String from, String to, String date) {
		this.pnr=pnr;
		this.price=price;
		this.from=from;
		this.to=to;
		this.date=date;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", price=" + price + ", from=" + from + ", to=" + to + ", date=" + date + "]";
	}
	@Override
	public int compareTo(Object o) {
		Ticket t = (Ticket)o;
		return -1*this.price.compareTo(t.price);
		
	}
}

