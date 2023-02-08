package com.trinhtrung.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinhtrung.fleetapp.models.Country;
import com.trinhtrung.fleetapp.repositories.CountryRepository;
import java.util.Optional;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//SAve new country
		public void save(Country country) {
			countryRepository.save(country);
		}
		
		//get by id
		public Optional<Country> findById(int id) {
			return countryRepository.findById(id);
		}

		public void delete(Integer id) {
			countryRepository.deleteById(id);
		}

}
