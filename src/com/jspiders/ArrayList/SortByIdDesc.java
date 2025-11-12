package com.jspiders.ArrayList;

import java.util.Comparator;

public class SortByIdDesc implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1)o1;
		Student1 s2 = (Student1)o2;
		return -1 * s1.id.compareTo(s2.id);
	}
}