import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keksdose {
	private Map<Keks, Integer> kekse = new HashMap<Keks, Integer>();

	public void addKeks(Keks keks) {
		if (kekse.containsKey(keks)) {
			int amount = kekse.get(keks);
			kekse.put(keks, amount + 1);
		} else {
			kekse.put(keks, 1);
		}
	}
	
	public void addKekse(List<Keks> kekse) {
		for(Keks keks : kekse) {
			addKeks(keks);
		}
	}

	public String inhalt() {
		return kekse.toString();
	}
}
