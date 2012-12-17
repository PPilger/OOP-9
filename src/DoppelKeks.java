/**
 * Doppelkeks repraesentiert einen doppelten Keks mit einer Fuellung besteht.
 */
public class DoppelKeks extends Keks {
	private Fuellung fuellung;

	public DoppelKeks(Keks keks, Fuellung fuellung) {
		super(keks);

		this.fuellung = fuellung;
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
		DoppelKeks other = (DoppelKeks) obj;
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
