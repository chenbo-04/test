package com.service;

import java.sql.SQLException;

import com.dao.UserDao;
import com.domain.User;

public class UserService {

	public boolean findUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDao();
		User temp = userDao.findUser(user);
		
		return temp==null?false:true;
	}


}
