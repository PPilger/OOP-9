/**
 * Diese Klasse repraesentiert einen Keks mit einer bestimmten Form und einem
 * bestimmten Teig.
 */
public class Keks extends Backware {
	private Form form;
	private Teig teig;

	public Keks(Form form, Teig teig) {
		this.form = form;
		this.teig = teig;
	}

	/**
	 * Kopiert den uebergebenen Keks
	 */
	public Keks(Keks original) {
		this.form = original.form;
		this.teig = original.teig;
	}

	/**
	 * Liefert einen neuen Keks mit den selben Eigenschaften wie dieser Keks.
	 * Der Typ des erzeugten Keks stimmt mit dem Typ dieses Keks ueberein.
	 */
	@Override
	protected Keks backen() {
		KeksBackmaschine backmaschine = form.getBackmaschine();

		return backmaschine.backeKeks(teig);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((teig == null) ? 0 : teig.hashCode());
		return result;
	}

	/**
	 * Wenn obj ein Keks ist, werden alle Eigenschaften der Kekse (this und obj)
	 * auf Gleichheit geprueft.
	 * 
	 * Liefert true wenn beide Kekse gleich sind und false anderenfalls.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Keks other = (Keks) obj;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (teig != other.teig)
			return false;
		return true;
	}

	/**
	 * Es wird "Keks:" gefolgt von allen Eigenschaften (mit ',' getrennt)
	 * zurueckgegeben.
	 */
	@Override
	public String toString() {
		return "Keks: " + form + ", " + teig;
	}
}
