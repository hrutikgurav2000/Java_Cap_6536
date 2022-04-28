package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {
	
	@Id // creates primary fiels
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	//generaate setter n getter
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
	
	
	//tp tring method
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}
	
	
}
