
public class Test {
	
	public static void main(String[] args) {
		
		Bestellung bestellung = new Bestellung();
		Dose dose;
		
		bestellung.add(new KeksPosition(1,new WeihnachtsmannForm(), Teig.Muerbteig));
		bestellung.add(new KeksPosition(3,new WeihnachtsmannForm(), Teig.Muerbteig));
		bestellung.add(new KeksPosition(2,new RundeForm(), Teig.Schokoladeteig));
		bestellung.add(new KeksPosition(3,new RundeForm(), Teig.Zimtteig));
		bestellung.add(new KeksPosition(4,new MondForm(), Teig.Schokoladeteig));

		System.out.println("Bestellung:");
		bestellung.drucke();
		
		dose = bestellung.backe();
		
		System.out.println("\nInhalt:");
		dose.inhalt();
	}
}
