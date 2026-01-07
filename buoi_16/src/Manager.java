public class Manager extends Developer {

	public Manager(String id, double baseSalary) {
        super(id, baseSalary);
    }

    public void greetingFromManager() {
        System.out.println("Hello world from Manager");
    }

    @Override
	public double calculateSalary() {
		return super.baseSalary * (1 + 2.25);
	}

    @Override
    public String toString() {
        return "Hello world";
    }

}