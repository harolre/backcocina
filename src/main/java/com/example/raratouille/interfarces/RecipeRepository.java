package com.example.raratouille.interfarces;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.raratouille.model.Chef;
import com.example.raratouille.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
	
	public List<Recipe> findByName(String name);
	
	//esto es pruebita nuevamente
	public List<Chef> findByChef (Chef chef);
	
	
}
