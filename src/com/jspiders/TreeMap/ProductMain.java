package com.jspiders.TreeMap;

import java.util.TreeMap;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Tab", 12999.0);
		Product p2 = new Product(2, "Shirt", 1999.0);
		Product p3 = new Product(3, "Chair", 999.0);
		Product p4 = new Product(4, "Shoe", 2999.0);
		
		TreeMap<Double, Product> t = new TreeMap<Double, Product>();
		t.put(p1.price, p1);
		t.put(p3.price, p3);
		t.put(p4.price, p4);
		t.put(p2.price, p2);
		
		System.out.println(t);
	}

}
