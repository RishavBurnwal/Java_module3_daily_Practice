package com.jspiders.ArrayList;

import java.util.ArrayList;

public class SearchOperation {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(56);
		al.add('P');
		al.add("Red");
		al.add(true);
		al.add('P');
		
		System.out.println(al.contains('p'));
		System.out.println(al.contains(56));
		
		System.out.println(al.indexOf('P'));
		System.out.println(al.indexOf(96));
		System.out.println(al.lastIndexOf('P'));
		
		ArrayList al2 = new ArrayList();
		al2.add(true);
		al2.add("Red");
		
		System.out.println(al2.containsAll(al));
		System.out.println(al.containsAll(al2));
	}
}
