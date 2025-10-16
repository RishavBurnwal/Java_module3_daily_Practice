package com.jspiders.exceptions;

public class Game2 {
	int hiScore = 0;
	static void createCopy() throws CloneNotSupportedException{
		Game2 original = new Game2();
		original.hiScore = 5000;
		
		Game2 copy = (Game2)original.clone();
		System.out.println(copy.hiScore);
	}
	public static void main(String[] args) {
		try {
			createCopy();
		}
		catch (CloneNotSupportedException e) {
			System.out.println("Clone Failed");
		}
	}

}
