public class DoppelkeksPosition extends KeksPosition {
	private Fuellung fuellung;

	public DoppelkeksPosition(int anzahl, Form form, Teig teig,
			Fuellung fuellung) {
		super(anzahl, form, teig);

		this.fuellung = fuellung;
	}

	@Override
	protected DoppelKeks backeEines() {
		DoppelkeksBackmaschine backmaschine = DoppelkeksBackmaschine.getInstance();
		Keks keks = super.backeEines();
		
		return backmaschine.backeDoppelkeks(keks, fuellung);
	}

	@Override
	protected String beschreibung() {
		return super.beschreibung() + ", doppelt mit " + fuellung;
	}
}
