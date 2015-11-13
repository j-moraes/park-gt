package com.ciandt.park.service;

import org.springframework.stereotype.Service;

import com.ciandt.park.model.Car;

@Service
public interface CarService {
	
	public Car insertCar(Car car);
	public void exibe(Car car);
}
