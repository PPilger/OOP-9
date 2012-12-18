/**
 * Eine Backmaschine, die weihnachtsmannfoermige Kekse backen kann.
 * 
 * Auf die (einzige) WeihMannKeksBackmaschine kann ueber getInstance zugegriffen
 * werden.
 */
public class WeihMannKeksBackmaschine extends KeksBackmaschine {
	private static WeihMannKeksBackmaschine instance;

	protected static WeihMannKeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new WeihMannKeksBackmaschine();
		}
		return instance;
	}

	private WeihMannKeksBackmaschine() {
	}

	/**
	 * Liefert eine WeihMannForm
	 */
	@Override
	protected WeihMannForm getForm() {
		return new WeihMannForm();
	}
}
