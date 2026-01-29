public class MysteriousBox<T> {

	private T value;
	
	public MysteriousBox(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public <E> boolean equalsByType(E otherValue) {
		return this.value.getClass().getSimpleName().equals(otherValue.getClass().getSimpleName());
	}
	
	@Override
	public String toString() {
		return String.format("MysteriousBox<%s> [value=%s]", this.value.getClass().getSimpleName(), this.value);
	}

}