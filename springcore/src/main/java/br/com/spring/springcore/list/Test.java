package br.com.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("br/com/spring//springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital name: " + hospital.getName());
		System.out.println("Departments: " + hospital.getDepartments());
		System.out.println("Type of List: " + hospital.getDepartments().getClass());
		
	}

}
