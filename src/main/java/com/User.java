package com;

import javax.persistence.GeneratedValue;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
	private @Id @GeneratedValue Long id;
	private String name;
	
	User() {
		
	}
	
	User(String name) {
		this.name = name;
	}

}
