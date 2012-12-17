/**
 * Doppelkeks erweitert Keks durch eine Fuellung.
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoppelKeks other = (DoppelKeks) obj;
		return fuellung.equals(other.fuellung);
	}

	@Override
	public String toString() {
		return super.toString() + ", doppelt mit " + fuellung;
	}
}
