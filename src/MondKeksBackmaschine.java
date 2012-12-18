/**
 * Eine Backmaschine, die mondfoermige Kekse backen kann.
 * 
 * Auf die (einzige) MondKeksBackmaschine kann ueber getInstance zugegriffen
 * werden.
 */
public class MondKeksBackmaschine extends KeksBackmaschine {
	private static MondKeksBackmaschine instance;

	protected static MondKeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new MondKeksBackmaschine();
		}
		return instance;
	}

	private MondKeksBackmaschine() {
	}

	/**
	 * Liefert eine MondForm
	 */
	@Override
	protected MondForm getForm() {
		return new MondForm();
	}
}
