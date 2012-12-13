
public class DoppelKeks extends Keks {
	private Fuellung fuellung;
	
	public DoppelKeks(Form form, Teig teig, Fuellung fuellung) {
		super(form, teig);
		
		this.fuellung = fuellung;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", doppelt mit " + fuellung;
	}
}
