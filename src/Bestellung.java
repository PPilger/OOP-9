import java.util.HashMap;
import java.util.Map;

/**
 * Eine Bestellung kann mehrere Positionen aufnehmen und speichern. Um die
 * Backwaren zu erhalten, koennen die Backwaren der Positionen gebacken werden.
 */
public class Bestellung<T extends Backware> {
	private Map<T, Integer> positionen = new HashMap<T, Integer>();

	/**
	 * Fuegt eine Position zur Bestellung hinzu.
	 * 
	 * Wenn p null ist, werden keine Aenderungen durchgefuehrt.
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
	 * aus.
	 */
	public void drucke() {
		int num = 1;

		for(T referenzWare : positionen.keySet()) {
			int anzahl = positionen.get(referenzWare);

			System.out.println("Position #" + num + ": " + anzahl + " x " + referenzWare);
			num++;
		}
	}

	/**
	 * Baeckt alle bestellten Backwaren und liefert sie in einem neuen
	 * Dose-Objekt zurueck.
	 */
	@SuppressWarnings("unchecked")
	public Dose<T> backe() {
		Dose<T> dose = new Dose<T>();

		for(T referenzWare : positionen.keySet()) {
			int anzahl = positionen.get(referenzWare);

			for (int i = 0; i < anzahl; i++) {
				Backware gebacken = referenzWare.backen();
				
				assert(gebacken.getClass() == referenzWare.getClass());

				dose.add((T) gebacken);
			}
		}

		return dose;
	}
}
