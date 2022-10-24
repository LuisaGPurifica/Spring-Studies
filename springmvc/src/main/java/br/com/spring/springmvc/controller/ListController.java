package br.com.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("displayList");

		Employee employee = new Employee(14, "Lívia", 12000);
		Employee employee2 = new Employee(10, "Victoria", 5000);
		Employee employee3 = new Employee(13, "Izabella", 1000);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);

		mav.addObject("employees", employees);

		return mav;
	}

}
