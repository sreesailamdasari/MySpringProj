package com.igate.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.WeakHashMap;

class Temp {

	public String toString() {
		return "temp";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(" Finalize method");
	}

}

public class WeekHashMapProg {
	public static void main(String[] args) {
		
		Map<Object, String> hashMap = new WeakHashMap<>();
		Temp t = new Temp();
		hashMap.put(t, "sree");
		System.out.println(hashMap);
		
		t=null;
		System.gc();
		System.out.println(hashMap);
	}
}
