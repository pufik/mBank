package com.epam.mbank.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.epam.mbank.utils.persistence.EntityManagerUtil;

public abstract class BaseDAO<T> {
	private EntityManager entityManager = null;
	private Class<T> objectClass = null;

	public BaseDAO(Class<T> objectClass) {
		entityManager = EntityManagerUtil.getEntityManager();
		this.objectClass = objectClass;
	}

	// Override for getting query
	public abstract String getAllQuery();

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

	@SuppressWarnings("unchecked")
	public Collection<T> getAll() {
		return (Collection<T>) entityManager.createQuery(getAllQuery()).getResultList();
	}

	public void remove(T object) {
		entityManager.getTransaction().begin();
		entityManager.remove(object);
		entityManager.getTransaction().commit();
	}
}
