package com.ciandt.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ciandt.park.model.Car;

@Controller
public class CarController {
	@RequestMapping(value = "/park-gt/car", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView modelAndview() {
		// Car car
		new ModelAndView();
		return new ModelAndView("car");
	}

}
