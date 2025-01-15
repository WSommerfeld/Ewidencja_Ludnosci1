public class Fasada implements Operacje_uzytkownika {

	public void uModifyDB(int operationNumber) {
		// TODO - implement Fasada.uModifyDB
		throw new UnsupportedOperationException();
	}


	public void modifyDB(int formNumber) {
		Logowanie logowanie = new Logowanie();
		boolean loginStatus = logowanie.authorize("login", "haslo");

		if (loginStatus) {
			BuforDanych buforDanych = new BuforDanych("01010101111", "Adam", "Adamski");
			OperateData operateData = new OperateData();
			operateData.modifData(buforDanych);
		} else {
			System.out.println("Authorization failed.");
		}
	}

	public void loginAttempt(String login, String password) {
		// TODO - implement Fasada.loginAttempt
		throw new UnsupportedOperationException();
	}

}