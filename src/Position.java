import java.util.ArrayList;
import java.util.List;

public abstract class Position {
	private int anzahl;

	public Position(int anzahl) {
		this.anzahl = anzahl;
	}

	protected final List<Keks> backeKekse() {
		List<Keks> kekse = new ArrayList<Keks>();

		for (int i = 0; i < anzahl; i++) {
			kekse.add(backeKeks());
		}

		return kekse;
	}
	
	protected abstract Keks backeKeks();
	
	protected abstract String beschreibung();

	@Override
	public String toString() {
		return anzahl + " x " + beschreibung();
	}
}
