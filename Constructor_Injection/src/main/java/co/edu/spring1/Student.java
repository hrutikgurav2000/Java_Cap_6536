package co.edu.spring1;

public class Student {
	//int id;
	private String name;
	Student(String name){
		super();
		this.name = name;
	}
	public void display() {
		System.out.println("Hello " + name);
	}
}
