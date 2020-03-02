package com.example.raratouille.model;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




import javax.persistence.ManyToMany;

import javax.persistence.Transient;





@Entity
public class Chef {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	//ESTO TAMBIEN ES NUEVO
	@Transient
	private  String idCuisine="";
	
	@ManyToMany
	private Set<Cuisine> cuisine;
	
	
	private String name;
	private String birthYear;
	private String nationality;
	private String restaurant;
	private byte[] image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdCuisine() {
		for(Cuisine e : cuisine) {
			idCuisine += e.getId()+", ";
		}
		return idCuisine;
	}
	public void setIdCuisine(String idCuisine) {
		this.idCuisine = idCuisine;
	}
	public Set<Cuisine> getCuisine() {
		return cuisine;
	}
	public void setCuisine(Set<Cuisine> cuisine) {
		this.cuisine = cuisine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Chef(int id, String idCuisine, Set<Cuisine> cuisine, String name, String birthYear, String nationality,
			String restaurant, byte[] image) {
		super();
		this.id = id;
		this.idCuisine = idCuisine;
		this.cuisine = cuisine;
		this.name = name;
		this.birthYear = birthYear;
		this.nationality = nationality;
		this.restaurant = restaurant;
		this.image = image;
	}
	@Override
	public String toString() {
		return name;
		
	}
	public Chef() {
		
	}
	
	
	
}
