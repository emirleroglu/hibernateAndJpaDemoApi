package com.halil.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halil.hibernateAndJpa.DataAccess.ICityDal;
import com.halil.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService {
	private ICityDal cityDal;

	@Autowired
	public CityManager(ICityDal cityDal) {

		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return this.cityDal.getAllCities();
	}

	@Override
	@Transactional
	public void add(City myCity) {
		this.cityDal.add(myCity);

	}

	@Override
	@Transactional
	public void update(City myCity) {
		this.cityDal.update(myCity);
	}

	@Override
	@Transactional
	public void delete(City myCity) {
		this.cityDal.delete(myCity);

	}

	@Override
	@Transactional
	public City getById(int id) {
	
		return this.cityDal.getById(id);
	}

}
