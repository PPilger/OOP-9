/**
 * Repraesentiert die Form eines Kekses.
 */
public abstract class Form {
	/**
	 * Liefert die zur Form passende KeksBackmaschine
	 */
	protected abstract KeksBackmaschine getBackmaschine();

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	/**
	 * Wenn this und obj beide die selbe Form darstellen, sind sie gleich.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return getClass() == obj.getClass();
	}
}
