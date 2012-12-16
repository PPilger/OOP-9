
public abstract class Form {
	public abstract KeksBackmaschine getBackmaschine();
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		return getClass() == obj.getClass();
	}
}
