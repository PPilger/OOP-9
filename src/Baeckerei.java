import java.util.Iterator;


public class Baeckerei {
	
	public void erzeugeBestellung(Bestellung b) {
		
		Iterator<Posten> it = b.iterator();
		
		while(it.hasNext()) {
			
			Posten p = it.next();
			
			/**
			 * TODO: Erkennen, was für ein Keks jetzt kommt !?
			 */
			
		}
		
	}
	
}
