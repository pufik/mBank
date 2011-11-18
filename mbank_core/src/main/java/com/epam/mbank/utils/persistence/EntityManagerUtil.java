package com.epam.mbank.utils.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private final static String PERSISTENCE_UNIT = "mBankPersistenceUnit";
	private static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	private static EntityManager entityManager = entityFactory.createEntityManager();

	private EntityManagerUtil() {
	}

	public static EntityManager getEntityManager() {
		return entityManager;
	}

	public static EntityManagerFactory getEntityFactory() {
		return entityFactory;
	}

}
