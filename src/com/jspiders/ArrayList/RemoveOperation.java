package com.jspiders.ArrayList;

import java.util.ArrayList;

public class RemoveOperation {
	public static void main(String[] args) {
		ArrayList bag1 = new ArrayList();
		bag1.add("Apple");
		bag1.add("Mango");
		bag1.add("Grapes");
		
		ArrayList bag2 = new ArrayList();
		bag2.add("Banana");
		bag2.add("Jackfruit");
		bag2.add("Mango");
		bag2.add("Grapes");
		
		System.out.println(bag1);
		System.out.println(bag2);
		
//		bag1.removeAll(bag2);
//		System.out.println(bag1); //[Apple]
//		System.out.println(bag2);
		
		bag1.retainAll(bag2);
		System.out.println(bag1); //[Mango, Grapes]
		System.out.println(bag2);
		
		bag2.clear();
		System.out.println(bag1);
		System.out.println(bag2);
		
	}

}
