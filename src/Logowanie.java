public class Logowanie {

	private boolean privileged;

	private BuforLogowania buforLogowania;

	public boolean authorize(String login, String password) {
		BuforLogowania buforLogowania = new BuforLogowania(login, password);
		Autoryzacja autoryzacja = new Autoryzacja();
        return autoryzacja.checkpassword(buforLogowania);
	}
	private boolean logAttempt(String login, String password) {
		// Example logic to validate login credentials
		return "user".equals(login) && "password".equals(password);
	}

}