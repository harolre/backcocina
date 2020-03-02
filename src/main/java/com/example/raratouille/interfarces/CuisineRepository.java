package com.example.raratouille.interfarces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.raratouille.model.Cuisine;

public interface CuisineRepository extends JpaRepository<Cuisine, Integer> {
	
	public Cuisine findById(int id);
	
	public List<Cuisine> findByType(String type);
	
	public List<Cuisine> findByTypeLike(String type);
	
	
}
