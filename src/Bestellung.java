import java.util.Iterator;
import java.util.LinkedList;

/**
 * Eine Bestellung kann mehrere Positionen aufnehmen und speichern. Um die
 * Backwaren zu erhalten, koennen die Backwaren der Positionen gebacken werden.
 */
public class Bestellung {
	private LinkedList<Position> postenListe = new LinkedList<Position>();

	/**
	 * Fuegt eine Position zur Bestellung hinzu.
	 * 
	 * Wenn p null ist, werden keine Aenderungen durchgefuehrt.
	 */
	public void add(Position p) {
		if (p != null) {
			this.postenListe.add(p);
		}
	}

	/**
	 * Gibt alle Positionen der Bestelliste zeilenweise auf der Standardausgabe
	 * aus.
	 */
	public void drucke() {
		Iterator<Position> it = this.postenListe.iterator();
		int num = 1;

		while (it.hasNext()) {
			Position position = it.next();

			System.out.println("Position #" + num + ": " + position);
			num++;
		}
	}

	/**
	 * Baeckt alle bestellten Backwaren und liefert sie in einem neuen
	 * Dose-Objekt zurueck.
	 */
	public Dose backe() {
		Dose keksdose = new Dose();

		for (Position position : postenListe) {
			keksdose.addAll(position.backe());
		}

		return keksdose;
	}
}
