package com.example.raratouille.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuisine {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Cuisine(int id, String type, String description) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
	}
	
	
	
	
	@Override 
	public String toString() {
		return type;
	}
	//Lo de arriba hace que se publique tanto la ID como el TYPO Y LA DESCRIPCION
	public Cuisine() {
		super();
		// TODO Auto-generated constructor stub
	}
}
