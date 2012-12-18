public class RundForm extends Form {
	/**
	 * Liefert die RundKeksBackmaschine
	 */
	@Override
	protected RundKeksBackmaschine getBackmaschine() {
		return RundKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Rund";
	}
}
