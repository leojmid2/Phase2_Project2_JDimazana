package com.flyAway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flyAway.Dao.UserDao;
import com.flyAway.model.User;


@Service
@Transactional
public class UserServiceImp implements UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public User getUser(long userid) {
		// TODO Auto-generated method stub
		return userDao.getUser(userid);
	}

	@Override
	@Transactional
	public long getCount(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.getCount(username,password);
	}

	@Override
	@Transactional
	public List<User> getUser(String username, String password) {
		// TODO Auto-generated method stub
		
		return userDao.getUser(username,password);
		//return users.get(0).getUserid();
		
	}

	@Override
	public User updateEmployee(User user) {
		// TODO Auto-generated method stub
		return userDao.updateEmployee(user);
	}


}
