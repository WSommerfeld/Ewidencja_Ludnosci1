public class Logowanie {

	private boolean privileged;

	private BuforLogowania buforLogowania;

	public boolean authorize(String login, String password) {
		return logAttempt(login, password);
	}
	private boolean logAttempt(String login, String password) {
		// Example logic to validate login credentials
		return "user".equals(login) && "password".equals(password);
	}

}