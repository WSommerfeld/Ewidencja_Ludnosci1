public class FasadaWidok implements Wprowadzanie_danych {

	/**
	 * 
	 * @param String
	 */
	public void DataInput(String data) {

		///
	}

	public void start() {

		LogIn log= new LogIn();
		log.login();
		Menu menu=new Menu();

		while(true)
		{
			DataInput("data");
			/// Symulacja wyboru
			int option=1;

			if(option==1)
			{
				/// podpiac modyfikacje przez formularze
			}
			if(option==2 && Logowanie.privileged)
			{
				/// podpiac uprzywilejowaną
			}

		}

	}

}