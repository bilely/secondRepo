package hb.tests;
import java.util.Calendar;
import java.util.Date;

//Désolé, je n'ai pas réussi à importer Mes méthode(allez savoir pourquoi...),
// Il semble en fait que rien ne se soit importé, je ne peux même pas utiliser les Getters & Setters...
// J'ai essayé de créer plusieurs projets différents mais ça ne marchait tourjours pas
// je suis déprimer, je n'ai même pas put créer des personnage --', c'est peut-être une erreur de code de ma part mais
// mais je trouve ça quand même bizarre de ne même pas pouvoir créer des perso...

import hb.utils.*; // voilà, l'importation ne fonctionne pas
import hb.utils.MonthUtils;
import hb.datas.*;
import hb.exceptions.*;
import hb.projos.*;
import hb.utils.*;
import hb.projos.Identity;
import hb.*;
import hb.projos.CartoonCharacter;
import hb.datas.CartoonsCharacters;
import hb.projos.CartoonCharacter;

public class NarutoTrip {

	public static int getMonthInValue(String month) { // Désolé, je n'ai pas réussi à importer Mes méthode(allez savoir
														// pourquoi...), je sais pertinamment que tu voulais qu'elles
														// soient dans la classe MonthUtils je l'ai donc écrit dans les
														// deux classes
		String[] months = { "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "août", "septembre",
				"octobre", "novembre", "décembre" };
		int i = 0;
		for (String m : months) {
			if (month.equalsIgnoreCase(m)) {
				return i;
			} else
				i++;
		}
		return i;
	}
	static Date getUtilDateByDayAndMonth(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		cal.set(Calendar.DAY_OF_MONTH,day);
		return cal.getTime();
	}
		
		
	public static void main(String[] args) {
		NarutoTrip naruto1 = new NarutoTrip();
//		String s1 = "mars";
//		System.out.println(getMonthInValue(s1));
//		System.out.println(getUtilDateByDayAndMonth(10,10,1999));
		
		
		
		
		
		
		

		
	}

}
