public interface Dostep_do_danych {

	/**
	 * 
	 * @param login
	 */
	boolean checklogin(String login);

	/**
	 * 
	 * @param login
	 * @param password
	 */
	boolean logattempt(String login, String password);

	/**
	 * 
	 * @param login
	 * @param password
	 */
	boolean getprivilege(String login, String password);

	/**
	 * 
	 * @param PESEL
	 * @param column
	 */
	String get(String PESEL, int column);

	/**
	 * 
	 * @param PESEL
	 * @param column
	 */
	void clear(String PESEL, int column);

	/**
	 * 
	 * @param data
	 * @param form
	 */
	void form(BuforDanych data, ModyfikacjaBazy form);

	/**
	 * 
	 * @param data
	 */
	void privilegeOperation(BuforDanych data);

}