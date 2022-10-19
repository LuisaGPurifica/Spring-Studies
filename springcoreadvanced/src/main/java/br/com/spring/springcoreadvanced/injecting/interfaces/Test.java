package br.com.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO orderBO = (OrderBO) context.getBean("bo");
		orderBO.placeOrder();
		
	}

}
