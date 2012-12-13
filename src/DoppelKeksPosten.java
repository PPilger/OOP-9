
public class DoppelKeksPosten extends KeksPosten {
	private Fuellung fuellung;

	public DoppelKeksPosten(Form form, Teig teig, Fuellung fuellung) {
		super(form, teig);
		
		this.fuellung = fuellung;
	}
}
