/**
 * Eine Backmaschine, die Kekse einer bestimmten Form backen kann.
 */
public abstract class KeksBackmaschine {
	/**
	 * Baeckt einen neuen Keks mit der durch die KeksBackmaschine bestimmten
	 * Form und dem angegebenen Teig.
	 */
	public Keks backeKeks(Teig teig) {
		return new Keks(getForm(), teig);
	}

	/**
	 * Liefert die unterstuetzte Keks-Form.
	 */
	protected abstract Form getForm();
}
