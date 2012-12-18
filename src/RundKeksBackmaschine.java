/**
 * Eine Backmaschine, die runde Kekse backen kann.
 * 
 * Auf die (einzige) RundKeksBackmaschine kann ueber getInstance zugegriffen
 * werden.
 */
public class RundKeksBackmaschine extends KeksBackmaschine {
	private static RundKeksBackmaschine instance;

	protected static RundKeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new RundKeksBackmaschine();
		}
		return instance;
	}

	private RundKeksBackmaschine() {
	}

	/**
	 * Liefert eine RundForm
	 */
	@Override
	protected RundForm getForm() {
		return new RundForm();
	}
}
