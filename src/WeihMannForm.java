public class WeihMannForm extends Form {
	/**
	 * Liefert die WeihMannKeksBackmaschine
	 */
	@Override
	protected WeihMannKeksBackmaschine getBackmaschine() {
		return WeihMannKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Weihnachtsmann";
	}
}
