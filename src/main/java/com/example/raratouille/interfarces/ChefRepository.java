package com.example.raratouille.interfarces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.raratouille.model.Chef;
import com.example.raratouille.model.Cuisine;
@Repository
public interface ChefRepository extends JpaRepository<Chef, Integer> {

	
	//public Chef findById(int id);
	public List<Chef> findByName(String name);
	
	
	
	//abajo es prueba
	public List<Chef> findByCuisine(Cuisine cuisine);
	//la linea de arriba es una prueba recien escrita
	public List<Chef> findByCuisineId(Integer idCuisine);
	
	
}