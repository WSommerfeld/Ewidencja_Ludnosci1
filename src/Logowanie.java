public class Logowanie {

	private boolean privileged;

	public boolean authorize(String login, String password) {
		BuforLogowania buforLogowania = new BuforLogowania(login, password);
		Autoryzacja autoryzacja = new Autoryzacja();
		privileged=autoryzacja.getprivilleged(buforLogowania);
        return autoryzacja.checkpassword(buforLogowania);
	}

	public boolean isPrivileged() {
		return privileged;
	}
}