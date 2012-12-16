
public class Test {
	
	public static void main(String[] args) {
		
		Bestellung bestellung = new Bestellung();
		Dose dose;
		
		bestellung.add(new KeksPosition(1,new WeihnachtsmannForm(), Teig.Muerbteig));
		bestellung.add(new KeksPosition(3,new WeihnachtsmannForm(), Teig.Muerbteig));
		
		System.out.println(bestellung.drucke());
		
		dose = bestellung.backe();
		
		System.out.println(dose.inhalt());
	}
}
