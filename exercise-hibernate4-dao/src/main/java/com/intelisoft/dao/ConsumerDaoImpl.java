package com.intelisoft.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.api.dao.IConsumerDao;
import com.intelisoft.model.Consumer;

public class ConsumerDaoImpl extends GenericDaoImpl<Consumer> implements IConsumerDao {

	private static final Logger log = Logger.getLogger(ConsumerDaoImpl.class);

	public ConsumerDaoImpl() {
		super(Consumer.class);
	}

	@Override
	public Consumer getByIdWithCars(long id, Session session) {

		return null;
	}
}