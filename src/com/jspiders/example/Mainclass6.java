package com.jspiders.example;

class Card{
	private long cardNumber = 1234123412341234L;
	private int pin = 1234;
	@Override
	public boolean equals(Object obj) {
		Card c = (Card)obj;
		if(this.cardNumber == c.cardNumber && this.pin == c.pin) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass6 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
	}
}
