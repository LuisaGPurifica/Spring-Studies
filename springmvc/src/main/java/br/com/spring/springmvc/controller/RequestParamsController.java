package br.com.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "email", required = false, defaultValue="") String email) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userReg");

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("E-mail: " + email);

		return mav;
	}

}
