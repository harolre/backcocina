package com.example.raratouille.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.raratouille.interfarces.ChefRepository;
import com.example.raratouille.model.Chef;
import com.example.raratouille.model.Cuisine;
import com.example.raratouille.model.Recipe;
import com.example.raratouille.services.ChefService;
import com.example.raratouille.services.CuisineService;
import com.example.raratouille.services.RecipeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
public class AppController {

	@Autowired
	private ChefService servicioChef;
	
	@Autowired
	private CuisineService servicioCuy;
	
	@Autowired
	private RecipeService servicioRep;
	
	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	/*@GetMapping("/index)
	public String inicio2() {
		
	}*/
	
	/*	@GetMapping("/cocinero")
		public String cocinero() {
			
			return "cocinero";
	
		} NO sirve por que creamos un nuevo mapping y no realiza nada*/
	
		@GetMapping("/cocina")
		public String cuisine() {
			
			return "cocina";
	
		}
		@GetMapping("/receta")
		public String recipe() {
			
			return "receta";
	
		}
		
		
		
	
	
	
	
	@GetMapping("/cocinero")
	public List<Chef> viewPaginaChefHome(Model model,@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = " ") String seleccionada,
			@RequestParam(defaultValue = " ") String variable
			) {
	/*	Page<Chef> chefPage=servicioChef.pageFiltrada(seleccionada.trim(), variable.trim(), page);
		model.addAttribute("chefPage", chefPage);
	//	model.addAllAttributes("currentPagechef")
		*/
		//return "indexChef";
		return servicioChef.findAllChef();
		
	}
	
	@PostMapping(value="/saveChef")
	public String saveChef(@ModelAttribute("chef") Chef chef) {
		servicioChef.insertAndUpdateChef(chef);
		return "redirect:/cocinero";
	
	}
	@PostMapping(value="/gchef")
	public Chef agregar(@RequestBody Chef chef) {
		return servicioChef.add(chef);
	}
	
	
	
	//PRUEBA DE ACTUALIZAR ---> YA FUNCIONA
	@PostMapping(value="/actualizarChef")
	public String actualizarChef(@ModelAttribute("chef") Chef chef) {
		servicioChef.insertAndUpdateChef(chef);
		return "redirect:/cocinero";
	}
	
	//PRUEBA DE BORRAR
	@GetMapping(value="deleteChef")
	public String deleteChef(Integer id) {		
		servicioChef.deletedChef(id);		
		return "redirect:/cocinero";
	}
	//------------------------ESTO YA ES CUISINE -----------------------------
	//Listar COCINA
	@GetMapping("/cuisine")
	public String viewPaginaCuisineHome(Model model,@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = " ") String seleccionada,
			@RequestParam(defaultValue = " ") String variable
			) {
		Page<Cuisine> cuisinePage=servicioCuy.pageFiltrada(seleccionada.trim(), variable.trim(), page);
		model.addAttribute("cuisinePage", cuisinePage);
	//	model.addAllAttributes("currentPagechef")
		//return "indexCuisine";
		return "cocina";
	}
	//GUARDAR COCINA
	@PostMapping("/saveCuisine")
	public String saveCuisine(@ModelAttribute("cuisine") Cuisine cuisine) {
		servicioCuy.insertAndUpdateCuisine(cuisine);
		return "redirect:/cuisine";
	}
	
	
	
	//Borrar Cocina
	@GetMapping(value="/deleteCuisine")
	public String deleteCuisine(Integer id) {
		servicioCuy.deletedCuisine(id);
		return "redirect:/cuisine";
	}
//--------------------------Esto es RECIPEEE---------------------------------------
	
	@GetMapping("/recipe")
	public String viewPaginaRecipeHome(Model model,@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = " ") String seleccionada,
			@RequestParam(defaultValue = " ") String variable
			) {
		Page<Recipe> recipePage=servicioRep.pageFiltrada(seleccionada.trim(), variable.trim(), page);
		model.addAttribute("recipePage", recipePage);
	//	model.addAllAttributes("currentPagechef")
		return "receta";
	}
	
	@PostMapping("/saveRecipe")
	public String saveRecipe(@Valid @ModelAttribute("recipe") Recipe recipe) {
		servicioRep.inserAndUpdateRecipe(recipe);
		return "redirect:/recipe";
	}
	
	//Borrar  Recipe
		@GetMapping(value="/deleteRecipe")
		public String deleteRecipe(Integer id) {
			servicioRep.deletedRecipe(id);
			return "redirect:/recipe";
		}
	
	
}
