package br.com.spring.springmvcorm.dao;

import java.util.List;

import br.com.spring.springmvcorm.entity.User;

public interface UserDao {

	int create(User user);

	List<User> findUsers();

}
