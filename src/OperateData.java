public class OperateData {

	private final int operationNumber;

	public void modifyData(BuforDanych dane) {
		WyborFormularza wyborFormularza = new WyborFormularza();
		ModyfikacjaBazy form = wyborFormularza.setForm(operationNumber);
		form.modifyData(dane);
	}

	public OperateData(int operationNumber) {
		this.operationNumber = operationNumber;
	}
}