/**
 * Diese Klasse definiert Form und Teigart eines Kekses.
 */
public class Keks implements Backware {
	private Form form;
	private Teig teig;

	public Keks(Form form, Teig teig) {
		this.form = form;
		this.teig = teig;
	}

	/**
	 * Kopierkonstruktor
	 * 
	 * @param other
	 *            Instanz eines anderen Keks-Objekts
	 */
	public Keks(Keks other) {
		this.form = other.form;
		this.teig = other.teig;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((teig == null) ? 0 : teig.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Keks other = (Keks) obj;
		return form.equals(other.form) && teig.equals(other.teig);
	}

	@Override
	public String toString() {
		return "Keks: " + form + ", " + teig;
	}
}
