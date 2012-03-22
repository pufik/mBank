package com.epam.mbank.data.dao;

import java.util.Collection;
import java.util.List;

public interface BaseDAO<T, I> {

	void save(T object);

	void update(T object);

	void saveAll(Collection<T> objects);

	T getById(I id);

	void remove(T object);
	
	List<T> getAll();
}
