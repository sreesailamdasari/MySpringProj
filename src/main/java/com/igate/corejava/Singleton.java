package com.igate.corejava;

public class Singleton {
	public static void main(String[] args) {
		int i=0;
		while(true){
			if(i++==4){
				break;
			}
			++i;
		}
		System.out.println(i++);
		System.out.println(i);
	}


}
