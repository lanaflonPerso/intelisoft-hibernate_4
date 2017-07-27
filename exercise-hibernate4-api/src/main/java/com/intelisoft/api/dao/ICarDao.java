package com.intelisoft.api.dao;

import org.hibernate.Session;

import com.intelisoft.model.Car;

public interface ICarDao extends IModelDao<Car> {

	public Car getByIdWithConsumer(long id, Session session);

}
