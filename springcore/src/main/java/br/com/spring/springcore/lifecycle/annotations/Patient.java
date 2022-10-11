package br.com.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	
	private int id;
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method!");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	
}
