package com.sort.map.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
// Without lamda 

	public static void main(String[] args) {
		Map<Employee, Integer> emp = new TreeMap<Employee, Integer>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});
		emp.put(new Employee(1, "Chandan", 465422), 19);
		emp.put(new Employee(3, "Deepak", 564345), 23);
		emp.put(new Employee(2, "Ankur", 765465), 34);
		emp.put(new Employee(4, "Anil", 276545), 32);
		emp.put(new Employee(5, "Atim", 987687), 14);
		emp.put(new Employee(7, "Delip", 657968), 45);
		emp.put(new Employee(6, "Mohan", 564235), 35);
		emp.put(new Employee(8, "Sashi", 678675), 36);

		System.out.println(emp);

	}

}
