package com.jspiders.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(90);
		al.add(13);
		al.add(7);
		
		for(Integer i : al) {  // for each loop
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
