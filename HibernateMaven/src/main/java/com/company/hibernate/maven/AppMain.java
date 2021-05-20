package com.jcg.hibernate.maven;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppMain {

	static User userObj;
	static Session sessionObj ;

	@SuppressWarnings("deprecation")
	public static void createSession() {
        SessionFactory sessionFactory = null;
        sessionFactory = new Configuration().configure().buildSessionFactory();
        sessionObj= sessionFactory.openSession();
        sessionObj.beginTransaction();
    }

	public static void main(String[] args) {
		System.out.println(".......Hibernate Maven Example.......\n");
		try {
			createSession();
				userObj = new User();
				userObj.setUserid(1);
				userObj.setUsername("alex_straton");
				userObj.setPassword("123123");
				userObj.setEmail("houka@gmail.com");
				sessionObj.save(userObj);
				sessionObj.getTransaction().commit();
				sessionObj.beginTransaction();
			System.out.println("\n.......Records Saved Successfully To The Database.......\n");

			List<User> result = sessionObj.createQuery("FROM "+ "User").list();
			for(User i : result) {
	             System.out.println("UserID: "+ i.getUserid());
	             System.out.println("Username: "+ i.getUsername());
	             System.out.println("Email: "+ i.getEmail());
	             System.out.println("Password: "+ i.getPassword());
	             System.out.println("=============================================");
	         }

		} catch(Exception sqlException) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			sqlException.printStackTrace();
		} 
				
				sessionObj.close();
	}
}