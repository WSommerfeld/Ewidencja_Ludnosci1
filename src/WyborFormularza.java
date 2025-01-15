public class WyborFormularza {

	private ModyfikacjaBazy attribute;
	private ModyfikacjaBazy form;

	public void operationData(BuforDanych dane) {
		// TODO - implement WyborFormularza.operationData
		throw new UnsupportedOperationException();
	}

	public ModyfikacjaBazy setForm(int formType) {
        return switch (formType) {
            case 1 -> new FormAktMarriage();
            case 2 -> new FormAktUrodzenia();
            case 3 -> new FormAktZgonu();
            default -> throw new IllegalArgumentException("Invalid form type");
        };
	}

}