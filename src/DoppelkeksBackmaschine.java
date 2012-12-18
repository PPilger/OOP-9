/**
 * Eine Backmaschine, die Doppelkekse backen kann.
 * 
 * Auf die (einzige) DoppelkeksBackmaschine kann ueber getInstance zugegriffen
 * werden.
 */
public class DoppelkeksBackmaschine {
	private static DoppelkeksBackmaschine instance;

	protected static DoppelkeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new DoppelkeksBackmaschine();
		}
		return instance;
	}

	private DoppelkeksBackmaschine() {
	}

	/**
	 * Baeckt einen Doppelkeks aus dem uebergebenen keks mit der uebergebenen
	 * Fuellung und liefert diesen zurueck.
	 */
	public Doppelkeks backeDoppelkeks(Keks keks, Fuellung fuellung) {
		return new Doppelkeks(keks, fuellung);
	}
}
