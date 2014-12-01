package com.zlp.tool;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.zlp.entity.User;

public class DBTool {
	// 校验用户登录信息
	public List<User> getUser () {
		List<User> users = new ArrayList<User>();
		Session session = HibernateUtil.currentSession();
		try {
			Transaction tx = session.getTransaction();
			tx.begin();
			Criteria crit = session.createCriteria(User.class);
			users = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally{
			HibernateUtil.closeSession();;
		}
		return users;
	}
	
	// 校验用户登录信息
	public User validate (String username) {
		User user = new User();
		Session session = HibernateUtil.currentSession();
		try {
			Transaction tx = session.getTransaction();
			tx.begin();
			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("username", username));
			
			List<User> users = crit.list();
			
			if (users == null || users.size() > 0) {
				user = (User)users.get(0);
			}
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally{
			HibernateUtil.closeSession();;
		}
		return user;
	}	
}
