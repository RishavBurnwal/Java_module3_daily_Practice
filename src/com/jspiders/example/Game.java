package com.jspiders.example;

public class Game implements Cloneable{
	int hiScore = 0;
	public static void main(String[] args) throws CloneNotSupportedException  {
		Game ref = new Game();
		ref.hiScore=5000;
		
		Game copy = (Game)ref.clone();
		System.out.println(copy.hiScore);
	}

}
