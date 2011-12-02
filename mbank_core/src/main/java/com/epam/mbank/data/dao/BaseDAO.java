package com.epam.mbank.data.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epam.mbank.utils.persistence.EntityManagerUtil;

public abstract class BaseDAO<T> {
	// TODO Change getAll method
	private EntityManager entityManager = null;
	private Class<T> objectClass = null;

	public BaseDAO(Class<T> objectClass) {
		entityManager = EntityManagerUtil.getEntityManager();
		this.objectClass = objectClass;
	}

	public void save(T object) {
		entityManager.getTransaction().begin();
		entityManager.persist(object);
		entityManager.getTransaction().commit();
	}

	public void saveAll(Collection<T> objects) {

		entityManager.getTransaction().begin();

		for (T object : objects) {
			entityManager.persist(object);
		}

		entityManager.getTransaction().commit();
	}

	public T getById(Long id) {
		T object = null;
		entityManager.getTransaction().begin();
		object = (T) entityManager.find(objectClass, id);
		entityManager.getTransaction().commit();

		return object;
	}

	public void remove(T object) {
		entityManager.getTransaction().begin();
		entityManager.remove(object);
		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	protected List<T> executeQuery(String queryName, Map<String, Object> parameters) {
		List<T> resultList = null;

		beginTransaction();

		Query query = getEntityManager().createNamedQuery(queryName, objectClass);

		// Set query parameters
		for (String key : parameters.keySet()) {
			query.setParameter(key, parameters.get(key));
		}

		resultList = (List<T>) query.getResultList();

		closeTransaction();

		return resultList;
	}

	protected T executeQuerySingleResult(String queryName, Map<String, Object> parameters) {

		List<T> objects = executeQuery(queryName, parameters);
		T object = null;

		if (!objects.isEmpty()) {
			object = objects.get(0);
		}

		return object;
	}

	public void beginTransaction() {
		EntityManagerUtil.getEntityManager().getTransaction().begin();
	}

	public void closeTransaction() {
		EntityManagerUtil.getEntityManager().getTransaction().commit();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
