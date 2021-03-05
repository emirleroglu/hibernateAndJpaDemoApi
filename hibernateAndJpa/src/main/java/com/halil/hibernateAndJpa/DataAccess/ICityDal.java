package com.halil.hibernateAndJpa.DataAccess;

import java.util.List;

import com.halil.hibernateAndJpa.Entities.City;

public interface ICityDal {
	List<City> getAllCities();
	void add(City myCity);
	void update(City myCity);
	void delete (City myCity);
	City getById(int ıd);

}
