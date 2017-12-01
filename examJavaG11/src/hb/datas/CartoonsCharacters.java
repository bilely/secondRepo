package hb.datas;

import java.util.ArrayList;

import hb.exceptions.BloodGroupException;
import hb.projos.Birth;
import hb.projos.CartoonCharacter;
import hb.projos.Identity;
import hb.utils.*;

public class CartoonsCharacters {
	
	public  void getCharactersWhithoutLastname(char separator) {
		int i = 0;
		ArrayList<CartoonCharacter> listePersonnageSansNom = new ArrayList<>();
		for (CartoonCharacter m : listePersonnage) {
			if (m.getIdentity().getLastname().contains("*")) {
				m.getIdentity().getFirstname();
				System.out.println(m.getIdentity().getFirstname() + " --> Son nom de famille n'est pas connu" + separator);
				listePersonnageSansNom.add(m);
				}
			}
		return ;
	}
	
	public void BloodGroupException (CartoonCharacter n) throws BloodGroupException{
	if(n.getBloodGroup().length()>2) {
		throw new BloodGroupException(null);
		}
	}
	
	public static ArrayList<CartoonCharacter> listePersonnage = new ArrayList<>();
	
//	public static String[] getMainCharactersFirstname(CartoonCharacter m2) {
//		int i =0;
//		for (CartoonCharacter m : listePersonnage) {
//			if (m.isMainCharacter()) {
//			return	m.getIdentity().getFirstname();
//			}
//		}
//		
//	}
	
	public static void main(String[] args) {
	Identity perso1 = new Identity();
	perso1.setLastname("Uchiwa");
	perso1.setFirstname("Sasuke");
	
	CartoonCharacter sasuke = new CartoonCharacter();
	
	sasuke.setIdentity(perso1);
	sasuke.setClassification("Genin");
	sasuke.setGender("m");
	sasuke.setHomeVillage("Konoha");
	sasuke.setMainCharacter(true);
	sasuke.setBloodGroup("AB");
	
	Birth sasukeb = new Birth();
	sasukeb.setDay(23);
	sasukeb.setMonth("juillet");
	sasukeb.setAstrologicalSign(AstrologicalSigns.Lion);
	sasuke.setBirth(sasukeb);

	
	Identity perso2 = new Identity();
	perso2.setLastname("Haruno");
	perso2.setFirstname("Sakura");
	
	CartoonCharacter sakura = new CartoonCharacter();
	
	sakura.setIdentity(perso2);
	sakura.setClassification("Genin");
	sakura.setGender("f");
	sakura.setHomeVillage("Konoha");
	sakura.setMainCharacter(false);
	sakura.setBloodGroup("O");
	

	
	Birth sakurab = new Birth();
	sakurab.setDay(28);
	sakurab.setMonth("mars");
	sakurab.setAstrologicalSign(AstrologicalSigns.Lion);
	
	sakura.setBirth(sakurab);
	
	
	Identity perso3 = new Identity();
	perso3.setLastname("*****");
	perso3.setFirstname("Haku");
	
	CartoonCharacter haku = new CartoonCharacter();
	haku.setIdentity(perso3);
	haku.setClassification("Nukenin");
	haku.setGender("h");
	haku.setHomeVillage("Pays de l'eau");
	haku.setMainCharacter(false);
	
	Birth hakub = new Birth();
	hakub.setDay(9);
	hakub.setMonth("janvier");
	hakub.setAstrologicalSign(AstrologicalSigns.Capricorne);
	haku.setBirth(hakub);
	haku.setBloodGroup("O");
	
	listePersonnage.add(sasuke);
	listePersonnage.add(haku);
	listePersonnage.add(sakura);
	
	}
	
}
