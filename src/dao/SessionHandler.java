package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHandler {
	private static SessionFactory factory;
	private static Session sesion;
	
	public static void start() {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		sesion = factory.openSession();
		sesion.beginTransaction();
	}
	
	public static void close() {
		if(sesion.isOpen()) {
			sesion.close();
			factory.close();
		}
	}

	public static Session get() {
		if(sesion.isOpen())
			return sesion;
		else
			return null;
	}
}
