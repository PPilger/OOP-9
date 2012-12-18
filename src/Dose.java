import java.util.HashMap;
import java.util.Map;

/**
 * Realisiert eine Dose, Objekte zusammen mit der Anzahl (wie oft das Objekt
 * bereits eingefuegt wurde) abspeichert.
 * 
 * Setzt die korrekte implementierung von equals und hashcode in den zu
 * speichernden Objekten voraus.
 */
public class Dose<T> {
	// Enthaelt ein Objekt und die Anzahl wie oft es bereits eingefuegt wurde.
	private Map<T, Integer> inhalt = new HashMap<T, Integer>();

	/**
	 * Fuegt ein Objekt in zur Dose hinzu. Ist bereits ein gleiches Objekt
	 * enthalten, wird dessen Anzahl um 1 erhoeht. Ist kein solches Objekt
	 * enthalten, wird es mit der Anzahl 1 eingefuegt.
	 * 
	 * Ist obj null, bleibt der Zustand der Dose unveraendert.
	 */
	public void add(T obj) {
		if (obj != null) {
			if (inhalt.containsKey(obj)) {
				int amount = inhalt.get(obj);
				inhalt.put(obj, amount + 1);
			} else {
				inhalt.put(obj, 1);
			}
		}
	}

	/**
	 * Gibt die Objekte gemeinsam mit der Anzahl der Vorkommen zeilenweise auf
	 * der Standardausgabe aus.
	 * 
	 * Format (je Zeile): <anzahl> x <obj>
	 */
	public void inhalt() {
		for (T ware : inhalt.keySet()) {
			int amount = inhalt.get(ware);
			System.out.println(amount + " x " + ware);
		}
	}
}
