public class Developer extends Employee {

	public Developer(String id, double baseSalary) {
        super(id, baseSalary);
    }

    public void greetingFromDeveloper() {
        System.out.println("Hello world from Developer");
    }

    @Override
	public double calculateSalary() {
		return super.baseSalary * (1 + 1.25);
	}

    @Override
    public String toString() {
        return "B";
    }

}