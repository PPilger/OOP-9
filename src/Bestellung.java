import java.util.*;

public class Bestellung implements Iterable<Posten> {

	private LinkedList<Posten> postenListe;

	public Bestellung() {
		this.postenListe = new LinkedList<Posten>();
	}

	public void addPosten(Posten p) {
		this.postenListe.add(p);
	}

	public String drucke() {

		Iterator<Posten> it = this.postenListe.iterator();
		StringBuilder sb = new StringBuilder();
		int pos = 1;
		
		while (it.hasNext()) {

			Posten p = it.next();

			sb.append("Posten #" + pos + ": " + p.toString() + "\n");
			pos++;
		}

		return sb.toString();

	}

	@Override
	public Iterator<Posten> iterator() {
		return postenListe.iterator();
	}

}
