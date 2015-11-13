package com.ciandt.park.service;

import org.springframework.stereotype.Service;

import com.ciandt.park.dao.CarDAO;
import com.ciandt.park.model.Car;

@Service
public class CarServiceImpl implements CarService {
	private CarDAO carDAO;

	@Override
	public void exibe(Car car) {

	}


	public CarDAO getCarDAO() {
		return carDAO;
	}

	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}



	@Override
	public Car insertCar(Car car) {
		carDAO.save(car);
		return car;
	}
}
