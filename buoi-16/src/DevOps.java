public class DevOps extends Developer {

	public DevOps(String id, double baseSalary) {
        super(id, baseSalary);
    }

    @Override
	public double calculateSalary() {
		return super.baseSalary * (1 + 1.5);
	}

    @Override
    public String toString() {
        return "C";
    }

}