public class Record {

	private int PESEL;
	private String name;
	private String surname;
	private String bdate;
	private String bplace;
	private String bcountry;
	private boolean married;
	private char sex;
	private String citizenship;
	private int sPESEL;
	private String ddate;

	public Record(int PESEL1, String name1, String surname1, String bdate1, String bplace1, String bcountry1,
				  boolean married1, char sex1, String citizenship1, int sPESEL1, String ddate1)
	{
		PESEL=PESEL1;
		name=name1;
		surname=surname1;
		bdate=bdate1;
		bplace=bplace1;
		bcountry=bcountry1;
		married=married1;
		sex=sex1;
		citizenship=citizenship1;
		sPESEL=sPESEL1;
		ddate=ddate1;
	}
}