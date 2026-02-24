package com.config.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	//@Value("#{20<21?1:0}")
	//@Value("#{T(java.lang.Math).abs(-99)}")
	//@Value("#{new Integer(88)}")
	//T Says That I want to use a class, not a variable.
	@Value("#{T(java.lang.Integer).MAX_VALUE}")


	private int id;
	@Value("#{'Rushi Rasal'}")
	private String name;
	@Value("#{topics}")
	private List<String> topics;

	// It is used to automatically inject dependency (object) into another class.
	@Autowired
	private Profile profile;
	
	@Value("#{(2+4>5)}")
	private boolean active;

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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}

	//toString() is used to convert an object into a readable string format.
	
}
