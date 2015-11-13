package com.ciandt.park.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ciandt.park.model.Car;
@Repository
public interface CarDAO extends CrudRepository<Car, Long> {
	@Query(name=Car.BUSCA_DE_CARRO_POR_NOME)
	public String findByName(@Param("name") String name);
    
}
