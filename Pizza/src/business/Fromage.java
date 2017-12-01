package business;

public class Fromage {
	
	private String nom;
	private String type ;
	
	
	
	
	public Fromage() {
		super();
	}
	
	public Fromage(String nom) {
		super();
		this.nom = nom;
	}
	public Fromage(String nom, String type) {
		super();
		this.nom = nom;
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return (nom != null ? getNom( ) : "") + (type != null ? getType() : "") ;
	}
	
	
	

	
	
	
}
