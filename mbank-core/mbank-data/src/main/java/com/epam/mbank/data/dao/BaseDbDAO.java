package com.epam.mbank.data.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epam.mbank.utils.persistence.EntityManagerUtil;

public abstract class BaseDbDAO<T, I> implements BaseDAO<T, I> {

	private EntityManager entityManager = null;
	private Class<T> objectClass = null;

	public BaseDbDAO(Class<T> objectClass) {
		entityManager = EntityManagerUtil.INSTANCE.getEntityManager();
		this.objectClass = objectClass;
	}

	@Override
	public void save(T object) {
		beginTransaction();
		entityManager.persist(object);
		closeTransaction();
	}

	@Override
	public void update(T object) {
		beginTransaction();
		entityManager.merge(object);
		closeTransaction();
	}

	@Override
	public void saveAll(Collection<T> objects) {

		beginTransaction();

		for (T object : objects) {
			entityManager.persist(object);
		}

		closeTransaction();
	}

	@Override
	public T getById(I id) {
		T object = null;

		beginTransaction();
		object = (T) entityManager.find(objectClass, id);
		closeTransaction();

		return object;
	}

	@Override
	public void remove(T object) {
		beginTransaction();
		entityManager.remove(object);
		closeTransaction();
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

	protected void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	protected void closeTransaction() {
		entityManager.getTransaction().commit();
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
