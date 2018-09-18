package com.eastict.service;

import java.util.List;

import com.eastict.common.myexception.IdException;
import com.tt.entity.User;


public interface UserService {
	List<User> selectAll();

	User findOne(Integer id) throws IdException;

	void delOne(Integer id);

	void addOne(User user);

	void updateOne(User user);
}
