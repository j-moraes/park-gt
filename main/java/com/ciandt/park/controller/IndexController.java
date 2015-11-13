package com.ciandt.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/park-gt/index")
	public ModelAndView modelAndView () {
		new ModelAndView();
		return new ModelAndView ("index");
	}
}
