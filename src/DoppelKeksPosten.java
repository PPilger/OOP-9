
public class DoppelKeksPosten extends KeksPosten {
	private Fuellung fuellung;

	public DoppelKeksPosten(int anzahl, Form form, Teig teig, Fuellung fuellung) {
		super(anzahl, form, teig);
		
		this.fuellung = fuellung;
	}
}
