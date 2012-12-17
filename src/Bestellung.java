import java.util.Iterator;
import java.util.LinkedList;

/**
 * Eine Bestellung kann mehrere Positionen aufnehmen und speichern. Nach einer
 * Ansammlung von Positionen können diese gebacken werden.
 */
public class Bestellung {
	private LinkedList<Position> postenListe;

	public Bestellung() {
		this.postenListe = new LinkedList<Position>();
	}

	/**
	 * Fügt eine Position in die Liste hinzu.
	 * 
	 * Vorbedingung: p darf nicht null sein.
	 * 
	 * @param p
	 *            Der Parameter muss eine Position sein.
	 */
	public void add(Position p) {
		this.postenListe.add(p);
	}

	/**
	 * Gibt die Bestellliste mit all ihren Positionen aus.
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
	 * Hier werden alle Positionen der Bestellung ausgebacken und in eine Dose
	 * gelegt.
	 * 
	 * Vorbedingung: Die postenListe darf nicht null sein.
	 * 
	 * @return Gibt eine gültige Instanz eines Dose-Objekts, gefüllt mit Keksen
	 *         zurück.
	 */
	public Dose backe() {
		Dose keksdose = new Dose();

		for (Position position : postenListe) {
			keksdose.addAll(position.backe());
		}

		return keksdose;
	}
}
