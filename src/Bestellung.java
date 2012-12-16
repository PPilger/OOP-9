import java.util.Iterator;
import java.util.LinkedList;

public class Bestellung {
	private LinkedList<Position> postenListe;

	public Bestellung() {
		this.postenListe = new LinkedList<Position>();
	}

	public void add(Position p) {
		this.postenListe.add(p);
	}

	public String drucke() {
		Iterator<Position> it = this.postenListe.iterator();
		StringBuilder sb = new StringBuilder();
		int pos = 1;

		while (it.hasNext()) {
			Position p = it.next();

			sb.append("Position #" + pos + ": " + p.toString() + "\n");
			pos++;
		}

		return sb.toString();
	}

	public Dose backe() {
		Dose keksdose = new Dose();

		for (Position position : postenListe) {
			keksdose.addAll(position.backe());
		}

		return keksdose;
	}
}
