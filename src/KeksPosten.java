public class KeksPosten implements Posten {
	private int anzahl;
	private Form form;
	private Teig teig;
	
	public KeksPosten(int anzahl, Form form, Teig teig) {
		this.anzahl = anzahl;
		this.form = form;
		this.teig = teig;
	}
	
	public String toString() {
		return "(Anzahl: " + this.anzahl + " // Form: " + this.form + " // Teig: " + this.teig + ")";
	}
	
	
}
