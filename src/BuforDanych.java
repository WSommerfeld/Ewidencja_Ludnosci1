public class BuforDanych implements Bufor {

	private String PESEL;
	private String fname;
	private String surname;
	private String bdate;
	private String bplace;
	private String bcountry;
	private boolean married;
	private char sex;
	private String citizenship;
	private String sPESEL;
	private String ddate;

	public BuforDanych(String PESEL, String fname, String surname) {
		this.PESEL = PESEL;
		this.fname = fname;
		this.surname = surname;
		this.bdate = "bdate";
		this.bplace = "bplace";
		this.bcountry = "bcountry";
		this.married = false;
		this.sex = 'M';
		this.citizenship = "citizenship";
		this.sPESEL = "sPESEL";
		this.ddate = "ddate";
	}

	public void inPESEL(String PESEL1) {

	}


	public void inname(String name1) {

	}


	public void insurname(String surname1) {

	}

	public void inbdate(String bdate1) {

	}

	public void inbplace(String bplace1) {

	}


	public void inbcountry(String bcountry1) {

	}

	public void inmarried(String married1) {

	}

	public void insex(String sex1) {

	}

	public void incitizenship(String citizenship1) {

	}

	public void insPESEL(String sPESEL1) {

	}

	public void inddate(String ddate1) {

	}

}