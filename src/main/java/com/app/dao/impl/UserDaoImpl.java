package com.app.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.User;
@Repository
public class UserDaoImpl implements IUserDao {
   private HibernateTemplate ht;
	@Override
	public Integer saveUser(User u) {
		return (Integer) ht.save(u);
	}

	@Override
	public void updateUser(User u) {
      ht.update(u);
	}

	@Override
	public void deleteUser(Integer id) {
    User u=new User();
    u.setId(id);
		ht.delete(u);
	}

	@Override
	public User getOneUser(Integer id) {
		return ht.get(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {
		return ht.loadAll(User.class);
	}

}
