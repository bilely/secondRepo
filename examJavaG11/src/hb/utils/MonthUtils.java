package hb.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MonthUtils { // Désolé, je n'ai pas réussi à importer la méthode dans la classe NarutoTrip(allez savoir pourquoi.. eclipse...), je l'ai donc recopié dans la class NarutoTrip
	
	public static int getMonthInValue(String month) {
	String[] months = {"janvier","fevrier","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre"};
		int i = 0;
		for (String m : months) {
			if (month.equalsIgnoreCase(m)) {
				return i;
			}else i++;
		}
		return i;
	}
	
	public static Date getUtilDateByDayAndMonth(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		cal.set(Calendar.DAY_OF_MONTH,day);
		Date date = new Date();
		return cal.getTime();
		
		
	}
	
//	public Date getDateFromString(String date) {
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRENCH);
//		Date parsedDate = new Date();
//		try {
//			parsedDate = df.parse(date);
//		}catch (ParseException e) {
//				e.printStackTrace();
//			}
//		return parsedDate;
//	}
//
//	
	
	
	@Override
	public String toString() {
		return "MonthUtils [" + (getClass() != null ? "getClass()=" + getClass() + ", " : "") + "hashCode()="
				+ hashCode() + ", " + (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	
	
}
