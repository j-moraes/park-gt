package com.ciandt.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Cars {
@RequestMapping("/park-gt/cars")
@ResponseBody
public ModelAndView modelAndView(Cars car, Cars Cars) {
	return new ModelAndView("cars");
}
}
