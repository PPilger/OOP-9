public class WeihnachtsmannKeksBackmaschine extends KeksBackmaschine {
	private static WeihnachtsmannKeksBackmaschine instance;

	protected static WeihnachtsmannKeksBackmaschine getInstance() {
		if (instance == null) {
			instance = new WeihnachtsmannKeksBackmaschine();
		}
		return instance;
	}

	private WeihnachtsmannKeksBackmaschine() {
	}

	@Override
	protected WeihnachtsmannForm getForm() {
		return new WeihnachtsmannForm();
	}
}
