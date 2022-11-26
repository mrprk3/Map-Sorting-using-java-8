package com.sort.map.practices.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Atim");
		map.put(12, "Akash");
		map.put(11, "Dheeraj");
		map.put(15, "Anil");

		List<Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());

		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		System.out.println(map);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(list);

		System.out.println("-----------------------------------------------------------------------");
		for (Entry<Integer, String> lists : list) {
			System.out.println(lists.getKey() + " " + lists.getValue());
		}

		// using map, entrySet, stream
		System.out.println("-----------------------------------------------------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach((i) -> System.out.println(i.getKey() + " " + i.getValue()));

	}

}
