public class OperateData {

	private int operationNumber;
	private BuforDanych dane;

	public void modifyData(BuforDanych dane) {
		WyborFormularza wyborFormularza = new WyborFormularza();
		ModyfikacjaBazy form = wyborFormularza.setForm(operationNumber);
		form.modifyData(dane);
	}

}