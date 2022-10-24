package br.com.spring.springmvcorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.spring.springmvcorm.dao.UserDao;
import br.com.spring.springmvcorm.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
