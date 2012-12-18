/**
 * Repraesentiert die Art der Fuellung eines Doppelkekses.
 */
public abstract class Fuellung {
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	/**
	 * Wenn this und obj beide die selbe Fuellung darstellen, sind sie gleich.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return getClass() == obj.getClass();
	}
}
