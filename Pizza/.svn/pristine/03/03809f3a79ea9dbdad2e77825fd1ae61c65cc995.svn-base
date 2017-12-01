package business;

import java.util.ArrayList;

public class Pizza {
	private String nom;
	private Fromage fromage;
	private Legume legume;
	private Proteine proteine;
	
	private ArrayList<Fromage> listFromage = new ArrayList<Fromage>();
	
	
	public Pizza() {
		super();
	}


	public Pizza(String nom) {
		super();
		this.nom = nom;
	}


	public Pizza(String nom, Fromage fromage) {
		super();
		this.nom = nom;
		this.fromage = fromage;
	}


	public Pizza(String nom, Fromage fromage, Legume legume) {
		super();
		this.nom = nom;
		this.fromage = fromage;
		this.legume = legume;
	}


	public Pizza(String nom, Fromage fromage, Legume legume, Proteine proteine) {
		super();
		this.nom = nom;
		this.fromage = fromage;
		this.legume = legume;
		this.proteine = proteine;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Fromage getFromage() {
		return fromage;
	}


	public void setFromage(Fromage fromage) {
		this.fromage = fromage;
	}


	public Legume getLegume() {
		return legume;
	}


	public void setLegume(Legume legume) {
		this.legume = legume;
	}


	public Proteine getProteine() {
		return proteine;
	}


	public void setProteine(Proteine proteine) {
		this.proteine = proteine;
	}


	@Override
	public String toString() {
		return getNom()  + "( " + (fromage != null ?  getFromage() + ", " : "") 
								+ (legume != null ? getLegume()  + ", " : "")
								+ (proteine != null ? getProteine() : "")
				;}
		

}


	
	
	
