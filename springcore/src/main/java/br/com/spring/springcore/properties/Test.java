package br.com.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("br/com/spring//springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs.toString());
		
	}

}
