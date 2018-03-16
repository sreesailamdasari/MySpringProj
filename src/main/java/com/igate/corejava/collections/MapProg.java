package com.igate.corejava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProg {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new LinkedHashMap<>();
		hashMap.put("Java", 101);
		hashMap.put("Mock", 105);
		hashMap.put("Spring", 102);
		hashMap.put("Rest", 104);
		hashMap.put("Hibernate", 103);
		hashMap.put("Hibernate", 106);
		
		System.out.println(hashMap);
		System.out.println("*********************************");
		Set<?> keySet = hashMap.entrySet();
		System.out.println("*********************************");
		System.out.println(keySet);
		Collection<?> collections = hashMap.values();
		System.out.println("***** Normal iteration *****");
		System.out.println(collections);
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		System.out.println("***** Lambda Expression *****");
		hashMap.entrySet().stream()
				.forEach(output -> System.out.println("Key :" + output.getKey() + "--value :" + output.getValue()));
		System.out.println("***** Using Iteration *****");
		Iterator<?> itr = keySet.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) itr.next();
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
			if ("Hibernate".equals(entry.getKey())) {
				entry.setValue(106);
			}
		}
		System.out.println("***** Sorting *****");
		Set<?> keySort = hashMap.keySet();
		List list=new ArrayList<>(keySort);
		Collections.sort(list);
		
		TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			treeMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(hashMap);
		System.out.println(treeMap);
	}
}
