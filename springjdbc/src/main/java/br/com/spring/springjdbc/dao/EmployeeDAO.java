package br.com.spring.springjdbc.dao;

import java.util.List;

import br.com.spring.springjdbc.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);

	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}
