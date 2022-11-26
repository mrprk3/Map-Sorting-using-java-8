package com.sort.map.practices.examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		books.put(new Book(10, "Java", 1000), 20);
		books.put(new Book(12, "C++", 1003), 23);
		books.put(new Book(14, "Python", 1004), 22);
		books.put(new Book(13, "DBMS", 1002), 26);
		books.put(new Book(9, "Network", 1001), 23);

		books.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getName)))
				.forEach((i) -> System.out.println(i));

		System.out.println("----------------------------------------------------------------");

		books.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPrice)))
				.forEach(System.out::println);
		;
		System.out.println("----------------------------------------------------------------");

		books.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getId)))
				.forEach((i) -> System.out.println(i));

	}

}
