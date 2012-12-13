
public class Keks {
	private Form form;
	private Teig teig;
	
	public Keks(Form form, Teig teig) {
		this.form = form;
		this.teig = teig;
	}
	
	@Override
	public String toString() {
		return "Keks: " + form + ", " + teig;
	}
}
