package com.halil.hibernateAndJpa.Business;

import java.util.List;

import com.halil.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAllCities();

	void add(City myCity);

	void update(City myCity);

	void delete(City myCity);

	City getById(int id);
}
