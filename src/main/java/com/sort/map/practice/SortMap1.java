package com.sort.map.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Atim", 1580);
		map.put("Anil", 1234);
		map.put("Deepak", 1543);
		map.put("Chandan", 1567);
		List<Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		// using directly Comparator's abstract method with lamda expression
		Collections.sort(entryList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		// iterate the data
		for (Entry<String, Integer> r : entryList) {
			System.out.println(r.getKey() + " " + r.getValue());
		}

	}

}
