package com.example.batch.springbatchmanish.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	@GeneratedValue
	public Long id;
	
	public String name;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + "]";
	}
	
	
}
