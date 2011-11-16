package com.epam.consoleApplication;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;

//This is a temp application loader

public class ApplicationLoader {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Client client = new Client();
		client.setName("Petydfgsdfgda");
		client.setEmail("dfsdfsd@email.com");
		client.setAddress("rtertert");
		client.setPhone("sdfgsdfgd");
		client.setComment("fsdsdf");
		client.setPassword("gfgdfgdfg");
		client.setType(ClientType.REGULAR);
		client.setId(3L);
		
		session.save(client);
		Client client1 = new Client();
		client1.setName("Yra");
		client1.setEmail("dfsdfsd@email.com");
		client1.setAddress("rtertert");
		client1.setPhone("sdfgsdfgd");
		client1.setComment("fsdsdf");
		client1.setPassword("gfgdfgdfg");
		client1.setType(ClientType.REGULAR);
		client1.setId(4L);

		session.save(client1);				
		session.getTransaction().commit();
	}

}
