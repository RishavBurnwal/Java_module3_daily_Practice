package com.jspiders.ArrayList;

import java.util.ArrayList;

public class GenericExample {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(85);
	al.add(90);
	al.add(100);
	al.add(12);
	System.out.println(al);
	
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("A");
	al1.add("Rishav");
	System.out.println(al1);
}
}
