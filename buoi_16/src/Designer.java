public class Designer extends Employee {

	public Designer(String id, double baseSalary) {
        super(id, baseSalary);
    }

    @Override
	public double calculateSalary() {
		return super.baseSalary * (1 + 0.75);
	}

}