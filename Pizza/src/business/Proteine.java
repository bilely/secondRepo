package business;

abstract class Proteine {
	private String nom;
	private String type ;
	
	
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
		return "Proteine [" + (nom != null ? "nom=" + nom + ", " : "") + (type != null ? "type=" + type : "") + "]";
	}

	
	
	
	
	
	
	
	
	

}
