package com.sort.map.practices.examples;

public class Subject {

	private String subject1;
	private String subject2;
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public Subject(String subject1, String subject2) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	@Override
	public String toString() {
		return "Subject [subject1=" + subject1 + ", subject2=" + subject2 + "]";
	}

	
}
