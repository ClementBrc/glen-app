package service;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Commande{

	@Column(name="numCom")
	private String numCom;
	
	@Column(name="dateHr")
	private LocalDateTime dateHeure = LocalDateTime.now();
	
	
}
