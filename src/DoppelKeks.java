
public class DoppelKeks extends Keks {
	private Fuellung fuellung;
	
	public DoppelKeks(Keks keks, Fuellung fuellung) {
		super(keks);
		
		this.fuellung = fuellung;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", doppelt mit " + fuellung;
	}
}
