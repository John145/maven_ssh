package cn.jxufe.service;

import cn.jxufe.dao.UserDao;
import cn.jxufe.domain.User;

public class UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User login(User user) {
		return userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
