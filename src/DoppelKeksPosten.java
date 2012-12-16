
public class DoppelKeksPosten extends KeksPosten implements Posten {
	private Fuellung fuellung;

	public DoppelKeksPosten(int anzahl, Form form, Teig teig, Fuellung fuellung) {
		super(anzahl, form, teig);
		
		this.fuellung = fuellung;
	}
	
	public String toString() {
		return super.toString() + ", Doppelkeks mit Fuellung: " + this.fuellung;
	}
}
