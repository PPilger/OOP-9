/**
 * Die WeihnachtsmannForm ist eine Erweiterung der Form. Sie erzeugt eine
 * WeihnachtsmannKeksBackmaschine.
 */
public class WeihnachtsmannForm extends Form {
	@Override
	public WeihnachtsmannKeksBackmaschine getBackmaschine() {
		return WeihnachtsmannKeksBackmaschine.getInstance();
	}

	@Override
	public String toString() {
		return "Weihnachtsmann";
	}
}
