package com.halil.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halil.hibernateAndJpa.Business.ICityService;
import com.halil.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {

		this.cityService = cityService;
	}

	@GetMapping("/cities")
	public List<City> get() {
		return cityService.getAllCities();
	}

	@PostMapping("/add")
	public void add(@RequestBody City myCity) {
		this.cityService.add(myCity);
	}

	@PostMapping("/update")
	public void update(@RequestBody City myCity) {
		this.cityService.update(myCity);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody City myCity) {
		this.cityService.delete(myCity);
	}

	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return this.cityService.getById(id);
	}

}
