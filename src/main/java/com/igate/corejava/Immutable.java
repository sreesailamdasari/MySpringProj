package com.igate.corejava;

public final class Immutable {
	private int i;

	Immutable(int i) {
		this.i = i;
	}

	public Immutable modify(int i) {
		if (this.i == i)
			return this;
		return (new Immutable(i));

	}

	public static void main(String[] args) {
		Immutable i = new Immutable(10);
		Immutable j = new Immutable(100);
		Immutable k = new Immutable(10);
		System.out.println((i == j) + "--" + (i == k));
	}
}