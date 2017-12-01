package hb.utils;

public enum AstrologicalSigns {
	
	Belier ("B�lier ","du 21 mars au 19 avril"),
	Taureau ("Taureau ","du 20 avril au 20 mai "),
	Gemeaux ("Gemeaux ","du 21 mai au 20 juin"),
	Cancer ("Cancer ","du 21 juin au 22 juillet "),
	Lion ("Lion ","du 23 juillet au 23 ao�t "),
	Vierge ("Vierge ","du 24 ao�t au 22 septembre "),
	Balance ("Balance ","du 23 septembre au 22 octobre "),
	Scorpion ("Scorpion ","du 23 octobre au 21 novembre "),
	Sagittaire ("Sagittaire ","du 22 novembre au 21 d�cembre "),
	Capricorne ("Capricorne ","du 22 d�cembre au 19 janvier "),
	Versau("Verseau","du 20 janvier au 19 f�vrier "),
	Poissons("Poissons","du 20 f�vrier au 20 mars");
	
	
	private String titre ="";
	private String perdiode="";
	
	private AstrologicalSigns(String titre, String perdiode) {
		this.setTitre(titre);
		this.setPerdiode(perdiode);
	}

	public String getPerdiode() {
		return perdiode;
	}

	public void setPerdiode(String perdiode) {
		this.perdiode = perdiode;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	
	

}	

