public class Logowanie {

	 static boolean loginstatus;
	 static boolean privileged;

	public boolean authorize(String login, String password) {
		BuforLogowania buforLogowania = new BuforLogowania(login, password);
		Autoryzacja autoryzacja = new Autoryzacja();
		boolean exist=autoryzacja.checklogin(buforLogowania);
		if(exist)
		{
			loginstatus=autoryzacja.checkpassword(buforLogowania);
			if(loginstatus)
			{
				privileged=autoryzacja.getprivilleged(buforLogowania);
			}
			else {
				System.out.println("Nieprawidłowe hasło");
			}
		}
		else {
			System.out.println("Nieprawidłowy login");
		}


        return loginstatus;
	}


}