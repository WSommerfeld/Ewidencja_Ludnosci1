public class LogIn {

	public void login() {
		/// POBIERANIE DANYCH
		String login="admin";
		String password="adminpass";
		///

		Fasada fasada=new Fasada();
		fasada.loginAttempt(login,password);

	}

}