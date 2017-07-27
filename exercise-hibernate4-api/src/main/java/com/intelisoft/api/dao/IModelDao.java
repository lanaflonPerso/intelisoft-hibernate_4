package com.intelisoft.api.dao;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.model.Model;

public interface IModelDao<T extends Model> {

	public void create(T model, Session session);

	public T getById(long id, Session session);

	public List<T> getAll(Session session);

	public void update(T model, Session session);

	public void delete(T model, Session session);

}
