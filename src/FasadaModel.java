public class FasadaModel implements Dostep_do_danych {

	public boolean checklogin(String login) {
	DaneLogowania dane = new DaneLogowania();
	boolean exist = dane.checklogin(login);
	return exist;
	}

	public boolean logattempt(String login, String password) {
		DaneLogowania dane = new DaneLogowania();
		boolean logged = dane.logattempt(login,password);
		return logged;
	}

	public boolean getprivilege(String login, String password) {
		DaneLogowania dane = new DaneLogowania();
		boolean privileged= dane.getprivilege(login,password);
		return privileged;
	}

	public String get(String PESEL, int column) {
		// TODO - implement FasadaModel.get
		throw new UnsupportedOperationException();
	}

	public void clear(String PESEL, int column) {
		// TODO - implement FasadaModel.clear
		throw new UnsupportedOperationException();
	}

	public void form(BuforDanych data, ModyfikacjaBazy form) {
		// TODO - implement FasadaModel.form
		throw new UnsupportedOperationException();
	}
	public void privilegeOperation(BuforDanych data){
		// TODO - implement FasadaModel.privilegeOperation
		throw new UnsupportedOperationException();
	}

}