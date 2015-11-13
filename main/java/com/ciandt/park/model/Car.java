package com.ciandt.park.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "CAR")
@NamedQueries(@NamedQuery(name = Car.BUSCA_DE_CARRO_POR_NOME, query = "select car c from CAR where c.name=:nome"))
public class Car {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	public static final String BUSCA_DE_CARRO_POR_NOME = "buscaDeCarrPorNome";

	public Car() {
		this.id=id;
		this.name = name;
	}

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

}
