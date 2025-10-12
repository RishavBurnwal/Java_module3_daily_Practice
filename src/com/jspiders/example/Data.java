package com.jspiders.example;

public class Data implements Cloneable{
	int size = 0;
	public static void main(String[] args) throws CloneNotSupportedException{
		Data ref = new Data();
		ref.size = 100;
		
		Data copy = (Data)ref.clone();
		System.out.println(copy.size);
	}

}
