package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProduct {
	public static void main(String[] args) {
		ArrayList<Product> al =new  ArrayList<Product>;
		al.add(new product(2, "Laptop" , 51000));
		
		
		collection.sort(al);
		Iterator<E> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
