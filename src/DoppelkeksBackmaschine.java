/**
 * 
 */
public class DoppelkeksBackmaschine {
	private static DoppelkeksBackmaschine instance;

	public static DoppelkeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new DoppelkeksBackmaschine();
		}
		return instance;
	}

	private DoppelkeksBackmaschine() {
	}

	public DoppelKeks backeDoppelkeks(Keks keks, Fuellung fuellung) {
		return new DoppelKeks(keks, fuellung);
	}
}
