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

	public void drucke() {
		Iterator<Position> it = this.postenListe.iterator();
		int num = 1;

		while (it.hasNext()) {
			Position position = it.next();

			System.out.println("Position #" + num + ": " + position);
			num++;
		}
	}

	public Dose backe() {
		Dose keksdose = new Dose();

		for (Position position : postenListe) {
			keksdose.addAll(position.backe());
		}

		return keksdose;
	}
}
