public class Fasada implements Operacje_uzytkownika {

	private boolean loginStatus;
	private boolean privileged;

	public void uModifyDB(int operationNumber) {
		if (privileged &&loginStatus) {
			System.out.println("Privileged access");
			// TODO - implement Fasada.uModifyDB
		}else {
			System.out.println("Authorization failed.");
		}
	}

	//uzytkownik najpierw musi sie zalogowac a nastepnie wywolywane jest modifyDB

	public void modifyDB(int formNumber) {
		if (loginStatus) {
			//Tu tak samo, dane na stale w kodzie
			BuforDanych buforDanych = new BuforDanych("01010101111", "Adam", "Adamski");
			OperateData operateData = new OperateData(formNumber);
			operateData.modifyData(buforDanych);
		} else {
			System.out.println("Authorization failed.");
		}
	}

	public void loginAttempt(String login, String password) {
		Logowanie logowanie = new Logowanie();
		loginStatus= logowanie.authorize(login, password);
		privileged = logowanie.isPrivileged();
	}

}