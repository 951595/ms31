package com.example.ms3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UniversityApp {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int totalClg;
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
	public int getTotalClg() {
		return totalClg;
	}
	public void setTotalClg(int totalClg) {
		this.totalClg = totalClg;
	}
	

}
