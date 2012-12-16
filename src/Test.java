
public class Test {
	
	public static void main(String[] args) {
		
		Bestellung b1 = new Bestellung();
		
		b1.addPosten(new KeksPosten(1,new WeihnachtsmannForm(), new MuerbTeig()));
		b1.addPosten(new KeksPosten(3,new WeihnachtsmannForm(), new MuerbTeig()));
		
		System.out.println(b1.drucke());
		
		
	}
}
