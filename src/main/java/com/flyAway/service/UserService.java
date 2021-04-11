package com.flyAway.service;

import java.util.List;

import com.flyAway.model.User;

public interface UserService {
	
	public User getUser(long userid);
	
	public long getCount(String username, String password);

	public List<User> getUser(String username, String password);

	public User updateEmployee(User user);



}
