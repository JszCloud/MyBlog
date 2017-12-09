package com.titular.myblog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.titular.myblog.dao.UserMapper;
import com.titular.myblog.pojo.User;
import com.titular.myblog.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	public UserMapper userMapper;
	@Override
	public User selectById(Integer userId) {
		User user=userMapper.selectByPrimaryKey(userId);
		System.out.println(user);
		return user;
	}

}
