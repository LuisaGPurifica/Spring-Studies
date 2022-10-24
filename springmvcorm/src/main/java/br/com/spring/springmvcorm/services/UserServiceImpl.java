package br.com.spring.springmvcorm.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.spring.springmvcorm.dao.UserDao;
import br.com.spring.springmvcorm.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	@Transactional
	public int save(User user) {
		// Business Logic
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
