package dev.project2.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf = null;
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			Configuration cgf = new Configuration();
			sf = cgf.configure().buildSessionFactory();	
		}
		return sf;
	}
	public static void main(String[] args) {
		System.out.println(sf);	
	}
}
