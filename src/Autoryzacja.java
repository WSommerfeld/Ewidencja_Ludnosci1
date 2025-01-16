public class Autoryzacja {

	/**
	 *
	 * @param bufor
	 */
	public boolean checklogin(BuforLogowania bufor) {
	FasadaModel fasada=new FasadaModel();
	boolean exist=fasada.checklogin(bufor.login);
	return exist;

	}
	/**
	 * 
	 * @param bufor
	 */
	public boolean checkpassword(BuforLogowania bufor) {
		FasadaModel fasada=new FasadaModel();
		boolean accepted=fasada.logattempt(bufor.login, bufor.password);
		return accepted;
	}

	/**
	 * 
	 * @param bufor
	 */
	public boolean getprivilleged(BuforLogowania bufor) {
	FasadaModel fasada=new FasadaModel();
	boolean privileged=fasada.getprivilege(bufor.login, bufor.password);
	return privileged;
	}

}