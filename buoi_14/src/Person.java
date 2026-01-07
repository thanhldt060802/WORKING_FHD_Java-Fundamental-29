public class Person {

	public String id;
	public String name;
	
	// public Person() {
	// 	System.out.println("Person() constructor is called!");
	// }

	public Person(String id) {
		System.out.println("Person(String) constructor is called!");
		this.id = id;
	}

	public Person(String id, String name) {
		System.out.println("Person(String, String) constructor is called!");
		this.id = id;
		this.name = name;
	}
	
	public String getInfo() {
		return String.format("Person [id=%s, name=%s]", this.id, this.name);
	}

	public String test() {
		return "Hello world!";
	}

}