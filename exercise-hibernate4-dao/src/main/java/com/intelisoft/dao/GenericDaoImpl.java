package com.intelisoft.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.api.dao.IModelDao;
import com.intelisoft.model.Model;

abstract class GenericDaoImpl<T extends Model> implements IModelDao<T> {

	private static final Logger log = Logger.getLogger(GenericDaoImpl.class);

	private Class<T> type;

	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

	@Override
	public void create(T model, Session session) {
		session.save(model);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(long id, Session session) {
		return (T) session.get(type, id);
	}

	@Override
	public List<T> getAll(Session session) {

			return null;
	}

	@Override
	public void update(T model, Session session) {
		session.update(model);
	}

	@Override
	public void delete(T model, Session session) {
		session.delete(model);
	}
}
