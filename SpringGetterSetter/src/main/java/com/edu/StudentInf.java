package com.edu;

public class StudentInf {
	private int id;
	private String name;
	private String course;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("id is "+ id);
		System.out.println("name is "+ name);
		System.out.println("course is "+ course);
	}
}
