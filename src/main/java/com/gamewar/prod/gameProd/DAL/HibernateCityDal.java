package com.gamewar.prod.gameProd.DAL;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gamewar.prod.gameProd.entitys.City;
@Repository
public class HibernateCityDal implements ICityDAL{

	

	private EntityManager entitymanager;	
	
	@Autowired
	public HibernateCityDal(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entitymanager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City city) {
		Session session = entitymanager.unwrap(Session.class);
		session.save(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		Session session = entitymanager.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		Session session = entitymanager.unwrap(Session.class);
		City cityDelete =session.get(City.class,city.getId());
		session.delete(cityDelete);
		
	}
	@Override
	@Transactional
	public City getById(int id) {
		Session session = entitymanager.unwrap(Session.class);
		City city =session.get(City.class, id);
		return city;
	}

}
