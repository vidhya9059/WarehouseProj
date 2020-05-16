package com.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
      private IUserDao dao;
	@Override
	@Transactional
	public Integer saveUser(User u) {
		return dao.saveUser(u);
	}
	@Transactional
	@Override
	public void updateUser(User u) {
dao.updateUser(u);
	}
	@Transactional
	@Override
	public void deleteUser(Integer id) {
dao.deleteUser(id);
	}
	@Transactional(readOnly=true)
	@Override
	public User getOneUser(Integer id) {
		return dao.getOneUser(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

}
