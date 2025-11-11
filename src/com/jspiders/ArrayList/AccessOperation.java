package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AccessOperation {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		
		Iterator i = al.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.next());
		i.remove(); // removes 4 (recently iterated element)
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(al);
		
//		while(i.hasNext()) {              // iterate each element --> 2 4 6 8
//			System.out.println(i.next());
//		}
		
	}

}
