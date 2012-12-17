import java.util.ArrayList;
import java.util.List;

/**
 * Definiert das Grundgeruest für eine Position. Es wird aufgenommen, wiviel
 * Stueck eine Position enthaelt.
 */
public abstract class Position {
	private int anzahl;

	public Position(int anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * Baeckt alle Kekse einer Position.
	 * 
	 * @return Gibt eine Liste mit den erzeugten Backwaren zurück.
	 */
	protected final List<Backware> backe() {
		List<Backware> kekse = new ArrayList<Backware>();

		for (int i = 0; i < anzahl; i++) {
			kekse.add(backeEines());
		}

		return kekse;
	}

	protected abstract Backware backeEines();

	protected abstract String beschreibung();

	@Override
	public String toString() {
		return anzahl + " x " + beschreibung();
	}
}
