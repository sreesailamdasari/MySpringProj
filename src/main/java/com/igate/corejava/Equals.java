package com.igate.corejava;

public class Equals implements Cloneable {
	String name;
	String id;

	public Equals() {
	}

	public Equals(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Equals equal = new Equals();
		Equals equal1 = (Equals) equal.clone();
		System.out.println(equal.equals(equal1));
		System.out.println(equal == equal1);
		// StringBuffer sb=new StringBuffer();
		// Equals equals = new Equals("a", "1");
		// Equals equals1 = new Equals("b", "2");
		// Equals equals2 = new Equals("a", "1");
		// Equals equals3=equals;
		//// System.out.println(equals.equals(equals1));
		//// System.out.println(equals.equals(equals2));
		//// System.out.println(equals.equals(equals3));
		// System.out.println(equals.equals("d"));
		//// System.out.println(equals.equals(null));
		//
	}

	// @Override
	// public boolean equals(Object obj) {
	// try {
	// System.out.println(this.name+"-"+this.id);
	// String name1 = this.name;
	// String id1 = this.id;
	//
	// Equals e = (Equals) obj;
	// String name2 = e.name;
	// String id2 = e.id;
	// if (name1.equals(name2) && id1 == id2) {
	// return true;
	// } else
	// return false;
	//
	// } catch (NullPointerException e) {
	// System.out.println("nullpointer ex");
	// return false;
	// }
	//
	// }

}
