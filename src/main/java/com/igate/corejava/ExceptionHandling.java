package com.igate.corejava;

import java.io.IOException;

class A {
	public int m1() {
		try {
			System.out.println("try");
//			System.out.println(10 / 0);
			 throw new IOException();
//			return 1;
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally");
			
		}
		// return 0;
		return 2;
	}
}

class B extends A {
	public void m2() {

	}
}

public class ExceptionHandling {
	public static void main(String[] args) throws IOException {
		A a = new A();
		int i=a.m1();
		System.out.println(i);
	}
}
