package com.sort.map.practices.examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {

	public static void main(String[] args) {
		Map<Student, Subject> students = new HashMap<Student, Subject>();
		students.put(new Student(100, "Atim", 987878787), new Subject("Java", "C++"));
		students.put(new Student(112, "Virat", 98645134), new Subject("C", "C++"));
		students.put(new Student(110, "Dhoni", 987346254), new Subject("JavaScript", "DS"));
		students.put(new Student(140, "Gail", 875634264), new Subject("Python", "DBMS"));

		students.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
				.forEach((i) -> System.out.println(i));

		System.out.println("-------------------------------------------------------------------------");

		students.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Subject::getSubject1)))
				.forEach((i) -> System.out.println(i));

	}

}
