package com.flyAway.Dao;

import java.util.List;

import com.flyAway.model.User;

public interface UserDao {
	
	public User getUser(long userid);
	
	public long getCount(String username, String password);

	public List<User> getUser(String username, String password);
	
	public User updateEmployee(User user);
}
