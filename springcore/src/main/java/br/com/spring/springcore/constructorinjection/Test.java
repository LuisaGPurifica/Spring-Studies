package br.com.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springcore/constructorinjection/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e.toString());
		
	}

}
