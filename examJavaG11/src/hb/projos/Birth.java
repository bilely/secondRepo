package hb.projos;

import hb.utils.AstrologicalSigns;

public class Birth {

	private int day;
	private String month;
	private AstrologicalSigns astrologicalSign;
	
	
	
	public Birth(int day, String month) {
		this.day = day;
		this.month = month;
	}

	public Birth() {
		// TODO Auto-generated constructor stub
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public AstrologicalSigns getAstrologicalSign() {
		return astrologicalSign;
	}

	public void setAstrologicalSign(AstrologicalSigns astrologicalSign) {
		this.astrologicalSign = astrologicalSign;
	}

	@Override
	public String toString() {
		return "Birth [day=" + day + ", " + (month != null ? "month=" + month + ", " : "")
				+ (astrologicalSign != null ? "astrologicalSign=" + astrologicalSign : "") + "]";
	}
	
	
}
