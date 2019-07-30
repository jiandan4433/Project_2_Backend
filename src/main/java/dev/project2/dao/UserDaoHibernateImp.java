package dev.project2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.project2.Util.HibernateUtil;
import dev.project2.entities.User;

public class UserDaoHibernateImp implements Userdao {

	private static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public User createUser(String username, String password) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		// TODO Auto-generated method stub
		sess.close();
		return null;
	}

	public User getUserByUsername(String username) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		// TODO Auto-generated method stub
		sess.close();
		return null;
	}

	public boolean deleteUser(User user) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		// TODO Auto-generated method stub
		sess.close();
		return false;
	}

}
