package com.igate.corejava;

public class MyThread {
	int i = 10;

	public int m1() {
		try {
			System.out.println("try block");
			System.out.println(10/0);
			System.out.println("after uncheked exception");
			System.exit(0);
			return i;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
			return 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("index out of bound exception");
		} finally {
			System.out.println("--finally block");
		}
		return i;
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.m1();
	}
}
