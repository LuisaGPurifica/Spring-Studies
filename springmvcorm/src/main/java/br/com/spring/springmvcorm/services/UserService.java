package br.com.spring.springmvcorm.services;

import java.util.List;

import br.com.spring.springmvcorm.entity.User;

public interface UserService {

	int save(User user);

	List<User> getUsers();

	User getUser(Integer id);

}
