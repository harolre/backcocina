package com.example.raratouille.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.raratouille.interfarces.ChefRepository;
import com.example.raratouille.model.Chef;
import com.example.raratouille.model.Cuisine;
@Service
public class ChefService {

	@Autowired
	private ChefRepository chefcito;
	
	//Buscar
	public List<Chef> findAllChef(){
		return chefcito.findAll();
	}
	//Buscar por Id
	public Chef findOneChefId(Integer id) {
		return chefcito.findById(id).get();
	}
	//Buscar por EL NOMBRE WEYES
	
	public List<Chef> findAllChefNombre(String name){
		
		return chefcito.findByName(name);
	}
	//Insertar y actualizar
	public void insertAndUpdateChef(Chef chef) {
		chefcito.save(chef);
	}
	public Chef add(Chef chef) {
		return chefcito.save(chef);
	}
	//Borrar
	public void deletedChef(Integer id) {
		
		chefcito.deleteById(id);
	}
	
	//PRUEBAAAA
	public Page<Chef> pageAll(int page){
		return chefcito.findAll(PageRequest.of(page, 9999));//ES PARA VER LA LISTA DE CHEF
		
	}
	
	//Prueba de nuevo el ultimo de ultimos esto es para mostrar la ID cuisine
	public List<Chef> findAllChefIdCuisine(Integer idCuisine){
		
		return chefcito.findByCuisineId(idCuisine);
	}
	//Borrar si sale mal
	public List<Chef> findAllChefCuisine(Cuisine cuisine){
		return chefcito.findByCuisine(cuisine);
	}
	
	
	
	
	
	//PRUEEBAAAAAAAAAAAA
	public Page<Chef> pageFiltrada(String seleccionada,String variable,int page){
		
		List<Chef> listachef = new ArrayList<Chef>();
		Page<Chef> pageList = pageAll(page);
		return pageList;
	}
	
	
	
	
	
	
	
}
