package hb.tests;
import java.util.Calendar;
import java.util.Date;

//D�sol�, je n'ai pas r�ussi � importer Mes m�thode(allez savoir pourquoi...),
// Il semble en fait que rien ne se soit import�, je ne peux m�me pas utiliser les Getters & Setters...
// J'ai essay� de cr�er plusieurs projets diff�rents mais �a ne marchait tourjours pas
// je suis d�primer, je n'ai m�me pas put cr�er des personnage --', c'est peut-�tre une erreur de code de ma part mais
// mais je trouve �a quand m�me bizarre de ne m�me pas pouvoir cr�er des perso...

import hb.utils.*; // voil�, l'importation ne fonctionne pas
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

	public static int getMonthInValue(String month) { // D�sol�, je n'ai pas r�ussi � importer Mes m�thode(allez savoir
														// pourquoi...), je sais pertinamment que tu voulais qu'elles
														// soient dans la classe MonthUtils je l'ai donc �crit dans les
														// deux classes
		String[] months = { "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "ao�t", "septembre",
				"octobre", "novembre", "d�cembre" };
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
