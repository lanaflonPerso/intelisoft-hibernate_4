package com.intelisoft.api.dao;

import org.hibernate.Session;

import com.intelisoft.model.Consumer;

public interface IConsumerDao extends IModelDao<Consumer> {

	public Consumer getByIdWithCars(long id, Session session);

}
