package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class AccessOperation2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(41);
		al.add(88);
		al.add(12);
		al.add(20);
		
		ListIterator li = al.listIterator();
		System.out.println(li.hasPrevious());
		System.out.println(li.next());
		li.add(90);
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(100);
		System.out.println(li.previous());
		System.out.println(al);
		
//		while (li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
	}
}
