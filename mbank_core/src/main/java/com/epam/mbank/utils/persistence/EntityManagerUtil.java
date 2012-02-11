package com.epam.mbank.utils.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum EntityManagerUtil {
	INSTANCE;

	private final static String PERSISTENCE_UNIT = "mBankPersistenceUnit";

	private EntityManagerFactory entityFactory;

	private EntityManagerUtil() {
		this.entityFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	}

	public EntityManager getEntityManager() {
		return entityFactory.createEntityManager();
	}

	public EntityManagerFactory getEntityFactory() {
		return entityFactory;
	}
}
