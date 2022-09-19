package com.gamewar.prod.gameProd.DAL;

import java.util.List;

import com.gamewar.prod.gameProd.entitys.City;

public interface ICityDAL {
	 
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
	}
