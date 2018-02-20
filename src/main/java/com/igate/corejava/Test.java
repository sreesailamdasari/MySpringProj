package com.igate.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	String name;
	String value;
	int i;

	Test(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	/*@Override
	public String toString() {
		return "Test [name=" + name + ", value=" + value + ", i=" + i + "]";
	}*/

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(4);
		System.out.println(Collections.binarySearch(list, 8));
		System.out.println(list);
	}
}

/*
	List list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	System.out.println(Collections.binarySearch(list, 4));
	
	// Triangle Program
	int size = 5;
	int i, j, k;
	for (i = 0; i < size + 1; i++) {
		for (j = size; j > i; j--) {
			System.out.print(" ");
		}
		for (k = 0; k < (2 * i - 1); k++) {
			System.out.print("*");
		}
		System.out.println();
	}

*/
