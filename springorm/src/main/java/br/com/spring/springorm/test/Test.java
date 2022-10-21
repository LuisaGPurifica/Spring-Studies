package br.com.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.spring.springorm.dao.ProductDAO;
import br.com.spring.springorm.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springorm/test/config.xml");
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		// Product product = new Product(1, "Iphone", "It's awesome!", 8000);
		// dao.create(product);
		// dao.update(product);
		// dao.delete(product);

		// Product find = dao.find(2);
		// System.out.println(find);

		System.out.println(dao.findAll());

	}

}
