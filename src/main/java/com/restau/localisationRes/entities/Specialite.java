package com.restau.localisationRes.entities;



import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;



@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @ManyToMany
    private List<Restaurant> restaurant;

    public Specialite() {
    }



    public Specialite(String nom, List<Restaurant> restaurant) {
		super();
		this.nom = nom;
		this.restaurant = restaurant;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



	public List<Restaurant> getRestaurant() {
		return restaurant;
	}



	public void setRestaurant(List<Restaurant> restaurant) {
		this.restaurant = restaurant;
	}


    

}
