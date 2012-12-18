/**
 * Definiert die verschiedenen Arten der Fuellung.
 */
public abstract class Fuellung {

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return getClass() == obj.getClass();
	}
}
