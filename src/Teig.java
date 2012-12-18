/**
 * Repraesentiert die Teigart eines Kekses.
 */
public abstract class Teig {

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	/**
	 * Wenn this und obj beide die selbe Teigart darstellen, sind sie gleich.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return getClass() == obj.getClass();
	}
}
