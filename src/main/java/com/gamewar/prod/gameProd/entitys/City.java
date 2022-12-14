package com.gamewar.prod.gameProd.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")

public class City {
@Id
@Column(name="Id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

@Column(name="name")
private String name;

@Column(name="countrycode")
private String countrycode;

@Column(name="district")
private String district;

@Column(name="population")
private int population;

public City(int id, String name, String countrycode, String district, int population) {
	this.id = id;
	this.name = name;
	this.countrycode = countrycode;
	this.district = district;
	this.population = population;
}
public City() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getCountryCode() {
	return countrycode;
}
public void setCountryCode(String countrycode) {
	this.countrycode = countrycode;
}

public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}

public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}

}
