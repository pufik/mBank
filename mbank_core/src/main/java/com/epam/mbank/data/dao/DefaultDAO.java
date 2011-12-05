package com.epam.mbank.data.dao;

import java.util.List;

public interface DefaultDAO<T> {
	
	public abstract List<T> getAll();
}
