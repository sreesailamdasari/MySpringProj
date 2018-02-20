package com.igate.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list = Collections.unmodifiableList(list);
		list.add("e");
		System.out.println(list);
		// list.remove("b");
		System.out.println(list);
	}

}
