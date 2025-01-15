public class BuforLogowania implements Bufor {

	private String login;
	private String password;

	public BuforLogowania(String password, String login) {
		this.password = password;
		this.login = login;
	}
}