public class FulltimeEmployee extends Employee {

    private double coefficientsSalary;

    public FulltimeEmployee(String id, String name, int age, int baseSalary, double coefficientsSalary) {
        super(id, name, age, baseSalary);
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary() * 8 * 30 * this.coefficientsSalary;
    }
    
}
