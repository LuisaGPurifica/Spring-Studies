package br.com.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("br/com/spring//springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println("Car dealer name: " + cardealer.getName());
		System.out.println("Models: " + cardealer.getModels());
		System.out.println("Type of List: " + cardealer.getModels().getClass());
		
	}

}
