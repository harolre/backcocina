package com.example.raratouille.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.raratouille.interfarces.CuisineRepository;
import com.example.raratouille.model.Chef;
import com.example.raratouille.model.Cuisine;

@Service
public class CuisineService {

	@Autowired
	private CuisineRepository cufcito;
	//Mostrar toda la id
	public List<Cuisine> findAllCuisine(){
		return cufcito.findAll();
	}
	
	public void insertAndUpdateCuisine(Cuisine cuisine) {
		
		 cufcito.save(cuisine);

		
	}
	
	public void deletedCuisine(Integer id) {
		 cufcito.deleteById(id);
	}
	
	
	
	//ESTO DEBE INICIARSE PRIMERO
	
	public Page<Cuisine> pageAll(int page){
		return cufcito.findAll(PageRequest.of(page, 5));//ES PARA VER LA LISTA DE CHEF
		
	}
	
	//ESTO ES EL FINAL
public Page<Cuisine> pageFiltrada(String seleccionada,String variable,int page){
		
		List<Cuisine> listacuisine = new ArrayList<Cuisine>();
		Page<Cuisine> pageList = pageAll(page);
		return pageList;
	}
	
	
}
