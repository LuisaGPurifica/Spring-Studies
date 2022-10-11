package br.com.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("br/com/spring/springcore/reftypes/refconfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student.toString());
		
	}

}
