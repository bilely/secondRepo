package hb.projos;
import java.util.Arrays;

import hb.exceptions.BloodGroupException;

public class CartoonCharacter {


	private Identity identity;
	private Birth  birth;
	private boolean mainCharacter = false;
	private String gender;						// Désolé, mais je n'arrivais pas à manipuler les char
	private String[] trait;
	private String classification;
	private String homeVillage;
	private String bloodGroup;

	public CartoonCharacter( String gender, String classification, String homeVillage, String bloodGroup) throws BloodGroupException {
	
		this.gender = gender;
		this.classification = classification;
		this.homeVillage = homeVillage;
		this.bloodGroup = bloodGroup;
		}
		


	
	
	public CartoonCharacter() {
		// TODO Auto-generated constructor stub
	}

	public Identity getIdentity() {
		return identity;
	}


	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Birth getBirth() {
		return birth;
	}

	public void setBirth(Birth birth) {
		this.birth = birth;
	}

	public boolean isMainCharacter() {
		return mainCharacter;
	}

	public void setMainCharacter(boolean mainCharacter) {
		this.mainCharacter = mainCharacter;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getTrait() {
		return trait;
	}

	public void setTrait(String[] trait) {
		this.trait = trait;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getHomeVillage() {
		return homeVillage;
	}

	public void setHomeVillage(String homeVillage) {
		this.homeVillage = homeVillage;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String string) {
		this.bloodGroup = string;
	}


	@Override
	public String toString() {
		return "CartoonCharacter [" + (identity != null ? "identity=" + identity + ", " : "")
				+ (birth != null ? "birth=" + birth + ", " : "") + "mainCharacter=" + mainCharacter + ", "
				+ (gender != null ? "gender=" + gender + ", " : "")
				+ (trait != null ? "trait=" + Arrays.toString(trait) + ", " : "")
				+ (classification != null ? "classification=" + classification + ", " : "")
				+ (homeVillage != null ? "homeVillage=" + homeVillage + ", " : "")
				+ (bloodGroup != null ? "bloodGroup=" + bloodGroup : "") + "]";
	}

	
	
	
}
