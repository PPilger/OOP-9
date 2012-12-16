public class DoppelkeksPosition extends KeksPosition {
	private Fuellung fuellung;

	public DoppelkeksPosition(int anzahl, Form form, Teig teig,
			Fuellung fuellung) {
		super(anzahl, form, teig);

		this.fuellung = fuellung;
	}

	@Override
	protected DoppelKeks backeKeks() {
		DoppelkeksBackmaschine backmaschine = DoppelkeksBackmaschine.getInstance();
		Keks keks = super.backeKeks();
		
		return backmaschine.backeDoppelkeks(keks, fuellung);
	}

	@Override
	protected String beschreibung() {
		return super.beschreibung() + ", doppelt mit " + fuellung;
	}
}
