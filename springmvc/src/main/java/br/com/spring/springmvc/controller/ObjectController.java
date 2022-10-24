package br.com.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("displayObject");

		mav.addObject("employee", new Employee(12, "Marcela", 4200));

		return mav;
	}

}
