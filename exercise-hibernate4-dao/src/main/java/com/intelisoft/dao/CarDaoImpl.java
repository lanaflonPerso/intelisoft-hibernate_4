package com.intelisoft.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.api.dao.ICarDao;
import com.intelisoft.model.Car;

public class CarDaoImpl extends GenericDaoImpl<Car> implements ICarDao {

	private static final Logger log = Logger.getLogger(CarDaoImpl.class);

	public CarDaoImpl() {
		super(Car.class);
	}

	@Override
	public Car getByIdWithConsumer(long id, Session session) {

		return null;
	}
}
