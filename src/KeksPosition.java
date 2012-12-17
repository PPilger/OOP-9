/**
 * Eine KeksPosition erweitert eine Position um die Eigenschaften Form & Teig.
 */
public class KeksPosition extends Position {
	private Form form;
	private Teig teig;

	public KeksPosition(int anzahl, Form form, Teig teig) {
		super(anzahl);

		this.form = form;
		this.teig = teig;
	}

	@Override
	protected Keks backeEines() {
		KeksBackmaschine backmaschine = form.getBackmaschine();

		return backmaschine.backeKeks(teig);
	}

	@Override
	protected String beschreibung() {
		return form + ", " + teig;
	}
}
