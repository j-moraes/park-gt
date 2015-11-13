package com.ciant.test.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.ciandt.park.model.Car;
import com.ciandt.park.service.CarService;

public class CarServiceTest {
	private CarService carService;
	
	@Before
	public void setup() {
		carService = Mockito.mock(CarService.class);
		Mockito.when(carService.insertCar(Mockito.any(Car.class))).thenReturn(new Car());
	}

	@Test
	public void test() {
		Car car = new Car();
		
		car =carService.insertCar(car);
		Assert.assertNotNull(car.getId());
	}

}
