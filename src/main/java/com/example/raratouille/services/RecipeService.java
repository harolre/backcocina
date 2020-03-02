package com.example.raratouille.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.raratouille.model.Cuisine;
import com.example.raratouille.model.Recipe;

import com.example.raratouille.interfarces.RecipeRepository;



@Service
public class RecipeService {
	@Autowired
	private RecipeRepository repecito;
	
	public List<Recipe> findAllRecipe(){
		return repecito.findAll();
	}
	
	
	public void inserAndUpdateRecipe(@Valid Recipe recipe) {
		repecito.save(recipe);
		
	}
	public void deletedRecipe(Integer id) {
		repecito.deleteById(id);
		
	}
	
	
	
	
	
	
	
	//VAMOS !!
	
	public Page<Recipe> pageAll(int page){
		return repecito.findAll(PageRequest.of(page, 5));//ES PARA VER LA LISTA DE CHEF
	}
public Page<Recipe> pageFiltrada(String seleccionada,String variable,int page){
		
		List<Recipe> listarecipe = new ArrayList<Recipe>();
		Page<Recipe> pageRecipe = pageAll(page);
		return pageRecipe;
	}
	

}
