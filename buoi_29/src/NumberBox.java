public class NumberBox<T extends Number> {

	private T value;
	
	public NumberBox(T value) {
		this.value = value;
	}
	
	public T getValue() {
		
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("NumberBox<%s> [value=%s]", this.value.getClass().getSimpleName(), this.value);
	}

}