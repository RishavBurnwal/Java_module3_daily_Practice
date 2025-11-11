package com.jspiders.ArrayList;

import java.util.ArrayList;

public class NonGenericExample {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(78);
	al.add("Rishav");
	al.add(true);
	al.add('R');
	for(Object o : al) {        //For each loop
		System.out.println(o);
	}
}
}
