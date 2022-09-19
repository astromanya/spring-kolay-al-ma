package com.gamewar.prod.gameProd.Bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamewar.prod.gameProd.DAL.ICityDAL;
import com.gamewar.prod.gameProd.entitys.City;

@Service

public class CityLister implements ICityService{

	private ICityDAL cityDal;
	
	@Autowired
	public CityLister(ICityDAL cityDal) {
		this.cityDal = cityDal;
	}
	@Transactional
	@Override
	public List<City> getAll() {
		
		return this.cityDal.getAll() ;
	}
	@Transactional
	@Override
	public void add(City city) {
		this.cityDal.add(city);
		
	}
	@Transactional
	@Override
	public void update(City city) {
		this.cityDal.update(city);
		
	}
	@Transactional
	@Override
	public void delete(City city) {
		this.cityDal.delete(city);
		 
	}
	@Override
	@Transactional
	public City getById(int id) {
		
		return this.cityDal.getById(id);
	}
}
