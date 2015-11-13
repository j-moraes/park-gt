package com.ciandt.park.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ciandt.park.model.Car;
import com.ciandt.park.service.CarService;

@Controller
@RequestMapping("/park-gt/cars")
public class CarRest {
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Car insertCar(Car car) {
		System.out.println(car);
		if (car == null) {
			carService.insertCar(car);
		}
		return car;
	}

	@RequestMapping(value = "/exibe", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Car exibe() {
		Car car = new Car();
		car.setId(123);
		if (car == null) {
			carService.exibe(car);
		}
		return car;
	}

}
