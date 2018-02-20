package com.igate.corejava;

import java.io.IOException;

class A {
	public void m1() {
		try {
			System.out.println("try");
			System.out.println(10 / 0);
			throw new IOException();
			// return 1;
		} catch (Exception e) {
			System.out.println("catch block");
		}
		// return 0;
	}
}

class B extends A {
	public void m2() {

	}
}

public class ExceptionHandling {
	public static void main(String[] args) throws IOException {
		A a = new A();
		a.m1();
	}
}
