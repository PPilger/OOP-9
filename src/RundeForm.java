public class RundeForm extends Form {
	@Override
	public RundKeksBackmaschine getBackmaschine() {
		return RundKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Rund";
	}
}
