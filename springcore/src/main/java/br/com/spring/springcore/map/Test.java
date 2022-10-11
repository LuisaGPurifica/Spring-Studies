package br.com.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("br/com/spring//springcore/map/mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer.toString());
		System.out.println("Type of List: " + customer.getProducts().getClass());
		
	}

}
