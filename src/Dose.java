import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dose {
	private Map<Backware, Integer> inhalt = new HashMap<Backware, Integer>();

	public void add(Backware backware) {
		if (inhalt.containsKey(backware)) {
			int amount = inhalt.get(backware);
			inhalt.put(backware, amount + 1);
		} else {
			inhalt.put(backware, 1);
		}
	}
	
	public void addAll(List<Backware> backwaren) {
		for(Backware backware : backwaren) {
			add(backware);
		}
	}

	public void inhalt() {
		for(Backware ware : inhalt.keySet()) {
			int amount = inhalt.get(ware);
			System.out.println(amount + " x " + ware);
		}
	}
}
