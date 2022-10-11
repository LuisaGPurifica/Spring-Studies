package br.com.spring.springcore.lifecycle.xmlconfig;

public class Patient {
	
	private int id;
	
	public void hi() {
		System.out.println("Inside hi method!");
	}
	
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
