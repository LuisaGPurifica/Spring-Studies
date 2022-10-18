package br.com.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition a = (Addition) context.getBean("addition");
		System.out.println(a);
		
	}

}
