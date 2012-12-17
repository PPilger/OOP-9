/**
 * @TODO: Pilgi
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

	@Override
	protected RundeForm getForm() {
		return new RundeForm();
	}
}
