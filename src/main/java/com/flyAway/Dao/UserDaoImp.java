package com.flyAway.Dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flyAway.model.User;

@Repository
public class UserDaoImp implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public User getUser(long userid) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession().get(User.class, userid);

	}

	@SuppressWarnings("unchecked")
	@Override
	public long getCount(String username, String password) {
		// TODO Auto-generated method stub
		Query q = sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) from User WHERE username = '"+username + "' AND password = '"+password+"'");
		List<Long> list = q.list();
		return list.get(0);
		//return (User)sessionFactory.getCurrentSession().get(User.class, username);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUser(String username, String password) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User WHERE username = '"+username + "' AND password = '"+password+"'").list();
		
	}
	
	@Override
	public User updateEmployee(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	


}
