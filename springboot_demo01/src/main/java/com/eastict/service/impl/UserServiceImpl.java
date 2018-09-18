package com.eastict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eastict.common.myexception.IdException;
import com.eastict.dao.UserDao;

import com.eastict.service.UserService;
import com.tt.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> selectAll() {

		return userDao.selectAll();
	}

	@Override
	public User findOne(Integer id) throws IdException {
		
		User user = userDao.selectByPrimaryKey(id);
		
		if (user==null) {
			throw new IdException("id:"+id+"不存在");
		}
		
		return user;
	}

	@Override
	public void delOne(Integer id) {

		userDao.deleteByPrimaryKey(id);
	}

	@Override
	public void addOne(User user){

		userDao.addOne(user);		
	}

	@Override
	public void updateOne(User user) {
		
		userDao.updateByPrimaryKey(user);
	}
}
