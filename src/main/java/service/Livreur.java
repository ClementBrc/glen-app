package service;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Livreur {

	@Column(name="nomLiv")
	private String nomLivreur;
	
	@Column(name="prenomLiv")
	private String prenomLivreur;

	public Livreur(String nomLivreur, String prenomLivreur) {
		super();
		this.nomLivreur = nomLivreur;
		this.prenomLivreur = prenomLivreur;
	}

	public String getNomLivreur() {
		return nomLivreur;
	}

	public void setNomLivreur(String nomLivreur) {
		this.nomLivreur = nomLivreur;
	}

	public String getPrenomLivreur() {
		return prenomLivreur;
	}

	public void setPrenomLivreur(String prenomLivreur) {
		this.prenomLivreur = prenomLivreur;
	}
	
}
