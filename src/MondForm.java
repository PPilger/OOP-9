public class MondForm extends Form {
	@Override
	public MondKeksBackmaschine getBackmaschine() {
		return MondKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Mond";
	}
}
