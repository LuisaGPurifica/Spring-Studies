package br.com.spring.springorm.dao;

import java.util.List;

import br.com.spring.springorm.entity.Product;

public interface ProductDAO {

	int create(Product product);

	void update(Product product);

	void delete(Product product);

	Product find(int id);

	List<Product> findAll();

}
