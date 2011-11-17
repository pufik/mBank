package com.epam.consoleApplication;

import javax.persistence.EntityManager;

import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.persistence.EntityManagerUtil;

//TMP class for testing
class ClientDAO {
	public static Client create(Client client) {
		EntityManager em = EntityManagerUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		return client;
	}
}
