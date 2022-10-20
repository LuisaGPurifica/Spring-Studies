package br.com.spring.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import br.com.spring.springjdbc.dao.EmployeeDAO;
import br.com.spring.springjdbc.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/spring/springjdbc/test/config.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

		Employee employee = new Employee(1, "Luisa", "Purificação");

		int result = employeeDAO.create(employee);

		// int result = employeeDAO.update(employee);

		// int result = employeeDAO.delete(1);

		// System.out.println("Number of records updated are: " + result);

		List<Employee> employees = employeeDAO.read();

		for (Employee employee2 : employees) {
			System.out.println(employee2);
		}

	}

}
