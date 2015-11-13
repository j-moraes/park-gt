package com.ciandt.park.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import com.google.gson.Gson;

@Entity
public class Costumer {


	@Id
	@Column
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Car car = new Car();
	Gson gson = new Gson();
}
