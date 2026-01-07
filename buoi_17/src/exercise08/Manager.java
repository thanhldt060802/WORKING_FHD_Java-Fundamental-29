package exercise08;

public class Manager extends Employee {

    private double bonusRate;

    public Manager(String id, String name, int salary, double coefficientsSalary, double bonusRate) {
        super(id, name, salary, coefficientsSalary);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() * (1 + this.bonusRate);
    }

    @Override
    public String toString() {
        return "Manager [id=" + super.getId() + ", name=" + super.getName() + ", salary=" + super.getSalary() + 
        ", coefficientsSalary=" + super.getCoefficientsSalary() + ", bonusRate=" + this.bonusRate + "]";
    }
    
}
