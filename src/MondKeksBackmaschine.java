/**
 * @TODO: Pilgi
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

	@Override
	protected MondForm getForm() {
		return new MondForm();
	}
}
