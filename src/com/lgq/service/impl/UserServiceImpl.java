package com.lgq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgq.dao.UserDao;
import com.lgq.obj.UserObj;
import com.lgq.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserObj> findAll() {
		return userDao.findAll();
	}
}
