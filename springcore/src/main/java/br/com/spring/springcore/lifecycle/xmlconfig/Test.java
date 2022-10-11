package br.com.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"br/com/spring//springcore/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println("Patient id: " + patient.getId());
		ctx.registerShutdownHook(); 
		
	}

}
