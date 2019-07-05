package service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chocolatine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nomChoc")
	private String nom;
	
	@Column(name="prixChoc")
	private float prix;
	
	@Column(name="tprChoc")
	private float temperature;
	
	@Column(name="pdsChoc")
	private float poids;

	public Chocolatine(String nom, float prix, float temperature, float poids) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.temperature = temperature;
		this.poids = poids;
	}

	public Chocolatine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Chocolatine [nom=" + nom + ", prix=" + prix + ", temperature=" + temperature + ", poids=" + poids + "]";
	}
	
	
}
