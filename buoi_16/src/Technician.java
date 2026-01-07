public class Technician extends Employee {

	public Technician(String id, double baseSalary) {
        super(id, baseSalary);
    }

    @Override
	public double calculateSalary() {
		return super.baseSalary * (1 + 2.0);
	}

}