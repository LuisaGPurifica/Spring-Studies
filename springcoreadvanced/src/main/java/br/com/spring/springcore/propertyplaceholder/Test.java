package br.com.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springcore/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);
	}
	
}
