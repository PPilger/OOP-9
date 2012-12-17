import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Realisiert eine Dose, welche Kekse aufnehmen kann.
 */
public class Dose {
	private Map<Backware, Integer> inhalt = new HashMap<Backware, Integer>();

	/**
	 * Fuegt eine Backware in die Dose hinzu.
	 * 
	 * Vorbedingung: backware darf nicht null sein.
	 * 
	 * @param backware
	 *            Eine Backware, welche in die Liste hinzugefuegt wird.
	 */
	public void add(Backware backware) {
		if (inhalt.containsKey(backware)) {
			int amount = inhalt.get(backware);
			inhalt.put(backware, amount + 1);
		} else {
			inhalt.put(backware, 1);
		}
	}

	/**
	 * Fuegt eine Liste von Backwaren in die Dose hinzu.
	 * 
	 * Vorbedingung: Die Liste darf nicht null sein.
	 * 
	 * @param backwaren
	 *            Eine Backwarenliste, welche in die Liste der Dose hinzugefuegt
	 *            wird.
	 */
	public void addAll(List<Backware> backwaren) {
		for (Backware backware : backwaren) {
			add(backware);
		}
	}

	/**
	 * Gibt den Inhalt der Dose aus, inkluse Anzahl der verschiedenen Kekse.
	 */
	public void inhalt() {
		for (Backware ware : inhalt.keySet()) {
			int amount = inhalt.get(ware);
			System.out.println(amount + " x " + ware);
		}
	}
}
