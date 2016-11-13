package com.tap.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.backend.dao.UserDAO;
import com.tap.backend.models.User;
import com.tap.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDAO userDAO;

	public User save(User user) { return userDAO.save(user); }
}
