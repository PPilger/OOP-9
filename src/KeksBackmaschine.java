/**
 * Definiert das Grundgeruest einer KeksBackmaschine.
 */
public abstract class KeksBackmaschine {
	public Keks backeKeks(Teig teig) {
		return new Keks(getForm(), teig);
	}
	
	protected abstract Form getForm();
}
