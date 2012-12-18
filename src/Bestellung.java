import java.util.LinkedHashMap;

/**
 * Eine Bestellung kann mehrere Positionen (Backware + Anzahl) aufnehmen und
 * speichern. Die bestellten Backwaren koennen gebacken und in einer Dose
 * zureuckgegeben werden.
 */
public class Bestellung<T extends Backware> {
	private LinkedHashMap<T, Integer> positionen = new LinkedHashMap<T, Integer>();

	/**
	 * Fuegt eine Position zur Bestellung hinzu. Diese wird ueber eine
	 * Referenzware und die Anzahl definiert.
	 * 
	 * Gibt es bereits eine Position mit der gewuenschten Referenzware, wird bei
	 * der bestehenden position die Anzahl erhoeht.
	 * 
	 * Wenn referenzWare null ist, werden keine Aenderungen durchgefuehrt.
	 */
	public void add(int anzahl, T referenzWare) {
		if (referenzWare != null) {
			if (positionen.containsKey(referenzWare)) {
				anzahl += positionen.get(referenzWare);
			}
			positionen.put(referenzWare, anzahl);
		}
	}

	/**
	 * Gibt alle Positionen der Bestelliste zeilenweise auf der Standardausgabe
	 * aus (in der Einfuegereihenfolge).
	 * 
	 * Format: Position #<num>: <anzahl> x <referenzWare>
	 */
	public void drucke() {
		int num = 1;

		for (T referenzWare : positionen.keySet()) {
			int anzahl = positionen.get(referenzWare);

			System.out.println("Position #" + num + ": " + anzahl + " x "
					+ referenzWare);
			num++;
		}
	}

	/**
	 * Baeckt alle bestellten Backwaren und liefert sie in einer neuen Dose
	 * zurueck.
	 */
	@SuppressWarnings("unchecked")
	public Dose<T> backe() {
		Dose<T> dose = new Dose<T>();

		for (T referenzWare : positionen.keySet()) {
			int anzahl = positionen.get(referenzWare);

			for (int i = 0; i < anzahl; i++) {
				Backware gebacken = referenzWare.backen();

				assert (gebacken.getClass() == referenzWare.getClass());

				dose.add((T) gebacken);
			}
		}

		return dose;
	}
}
