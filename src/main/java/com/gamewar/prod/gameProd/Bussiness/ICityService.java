package com.gamewar.prod.gameProd.Bussiness;

import java.util.List;

import com.gamewar.prod.gameProd.entitys.City;

public interface ICityService {

	List<City> getAll();
	void add(City city);
	
	void update(City city);
	
	void delete(City city);
    
	City getById(int id);
 	
	
	
}
