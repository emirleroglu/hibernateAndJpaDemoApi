package com.halil.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halil.hibernateAndJpa.Entities.City;

@Repository
public class HibernateCityDal implements ICityDal {

	private EntityManager entityManager;

	@Autowired
	public HibernateCityDal(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> getAllCities() {

		Session mySession = entityManager.unwrap(Session.class);
		List<City> cities = mySession.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City myCity) {
		Session mySession = entityManager.unwrap(Session.class);
		mySession.saveOrUpdate(myCity);

	}

	@Override
	@Transactional
	public void update(City myCity) {
		Session mySession = entityManager.unwrap(Session.class);
		mySession.saveOrUpdate(myCity);
	}

	@Override
	@Transactional
	public void delete(City myCity) {
		Session mySession = entityManager.unwrap(Session.class);
		City cityToDelete = mySession.get(City.class, myCity.getId());
		mySession.delete(cityToDelete);

	}

	@Override
	@Transactional
	public City getById(int id) {
		Session mySession = entityManager.unwrap(Session.class);
		City city = mySession.get(City.class, id);
		return city;
	}
	

}
