package com.jspiders.ArrayList;

import java.util.ArrayList;

public class InsertOperation {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(34);
		al.add("Hi");
		al.add(true);
		al.add(34);
		al.add(90);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		for(int i=0 ; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		ArrayList al1 = new ArrayList();
		al1.add(61);
		al1.add("Blue");
		System.out.println(al1);
		
		al1.addAll(al);
		System.out.println(al);
		System.out.println(al1);
	}

}
