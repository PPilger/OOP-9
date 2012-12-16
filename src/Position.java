import java.util.ArrayList;
import java.util.List;

public abstract class Position {
	private int anzahl;

	public Position(int anzahl) {
		this.anzahl = anzahl;
	}

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
