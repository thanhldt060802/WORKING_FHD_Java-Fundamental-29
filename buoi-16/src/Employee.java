public class Employee {

	public String id;
	public double baseSalary;

	public Employee(String id, double baseSalary) {
		this.id = id;
		this.baseSalary = baseSalary;
	}

	public double calculateSalary() {
		return this.baseSalary * (1 + 0.5);
	}

	@Override
	public String toString() {
		return "A";
	}

}