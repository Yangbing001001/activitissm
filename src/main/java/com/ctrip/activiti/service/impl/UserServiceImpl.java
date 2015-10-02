package com.ctrip.activiti.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ctrip.activiti.dao.UserMapper;
import com.ctrip.activiti.model.User;
import com.ctrip.activiti.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userDao;

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}