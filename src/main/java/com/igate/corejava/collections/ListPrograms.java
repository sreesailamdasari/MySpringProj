package com.igate.corejava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPrograms {
	public static void main(String[] args) {
		// initial capacity 10
		/** Array List
		 * 
		 * */
		List<Student> student = new ArrayList<>(4);

		student.add(new Student(1, "A"));
		student.add(new Student(5, "E"));
		student.add(new Student(3, "C"));
		student.add(new Student(2, "B"));
		student.add(new Student(4, "D"));
		student.add(1, new Student(1, "test"));

		Student student1 = new Student(1, "A");
		student.add(student1);
		student.add(null);
		// to get synchronized list
		List<Student> synchList = Collections.synchronizedList(student);
		Collection<Student> s = Collections.synchronizedCollection(student);

		/** Linked List */
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.addFirst("1");
		linkedList.set(0, "set");
		linkedList.add(0, "add");
		System.out.println(linkedList);// [add,set,a,b,c]

	}
}