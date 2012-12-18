/**
 * Doppelkeks repraesentiert einen doppelten Keks mit einer Fuellung.
 */
public class Doppelkeks extends Keks {
	private Fuellung fuellung;

	/**
	 * form darf nicht null sein.
	 */
	public Doppelkeks(Form form, Teig teig, Fuellung fuellung) {
		super(form, teig);

		this.fuellung = fuellung;
	}
	
	public Doppelkeks(Keks keks, Fuellung fuellung) {
		super(keks);

		this.fuellung = fuellung;
	}

	/**
	 * Liefert einen neuen Doppelkeks mit den selben Eigenschaften wie dieser
	 * Doppelkeks. Der Typ des erzeugten Doppelkeks stimmt mit dem Typ dieses
	 * Doppelkeks ueberein.
	 */
	@Override
	protected Doppelkeks backen() {
		DoppelkeksBackmaschine backmaschine = DoppelkeksBackmaschine
				.getInstance();
		Keks keks = super.backen();

		return backmaschine.backeDoppelkeks(keks, fuellung);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((fuellung == null) ? 0 : fuellung.hashCode());
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doppelkeks other = (Doppelkeks) obj;
		if (fuellung != other.fuellung)
			return false;
		return true;
	}

	/**
	 * Es wird "Keks:" gefolgt von allen Eigenschaften (mit ',' getrennt)
	 * zurueckgegeben.
	 */
	@Override
	public String toString() {
		return super.toString() + ", doppelt mit " + fuellung;
	}
}
