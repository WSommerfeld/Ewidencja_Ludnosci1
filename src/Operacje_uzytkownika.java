public interface Operacje_uzytkownika {

	/**
	 * 
	 * @param operationNumber
	 */
	void uModifyDB(int operationNumber);

	/**
	 * 
	 * @param formNumber
	 */
	void modifyDB(int formNumber);

	/**
	 * 
	 * @param login
	 * @param password
	 */
	void loginAttempt(String login, String password)
	;

}