package com.sort.map.practice;

import java.util.HashMap;
import java.util.Map;

public class SortMap2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Atim", 1580);
		map.put("Anil", 1234);
		map.put("Deepak", 1543);
		map.put("Chandan", 1567);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((i) -> System.out.println(i));
		System.out.println("----------------------------------------------------------");

		// using reference
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

		// using comparingByValue()
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
