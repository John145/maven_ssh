package cn.jxufe.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.jxufe.domain.User;

public class UserDao extends HibernateDaoSupport {
	public User findByUsernameAndPassword(String username,String password) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where username=? and password=?",username,password);
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
