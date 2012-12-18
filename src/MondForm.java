public class MondForm extends Form {
	/**
	 * Liefert die MondKeksBackmaschine
	 */
	@Override
	protected MondKeksBackmaschine getBackmaschine() {
		return MondKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Mond";
	}
}
