package exercise09;

public class Chef extends Employee {

    private int numberOfDishes;
    private double coefficientsBonusPerDishes;

    public Chef(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving,
        int hourOfOvertime, double bonusSalaryPerHourOfOvertime, int numberOfDishes, double coefficientsBonusPerDishes) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.numberOfDishes = numberOfDishes;
        this.coefficientsBonusPerDishes = coefficientsBonusPerDishes;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }

    public double getCoefficientsBonusPerDishes() {
        return coefficientsBonusPerDishes;
    }

    public void setCoefficientsBonusPerDishes(double coefficientsBonusPerDishes) {
        this.coefficientsBonusPerDishes = coefficientsBonusPerDishes;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() * (1 + this.numberOfDishes * this.coefficientsBonusPerDishes);
    }

    @Override
    public Employee copy() {
        return new Chef(super.getId(), super.getName(), super.getHourOfTimeserving(), super.getSalaryPerHourOfTimeserving(),
            super.getHourOfOvertime(), super.getBonusSalaryPerHourOfOvertime(),
            this.numberOfDishes, this.coefficientsBonusPerDishes);
    }

    @Override
    public String toString() {
        return "Chef [id=" + super.getId() + ", name=" + super.getName() + ", hourOfTimeserving=" + super.getHourOfTimeserving()
                + ", salaryPerHourOfTimeserving=" + super.getSalaryPerHourOfTimeserving() + ", hourOfOvertime=" + super.getHourOfOvertime()
                + ", bonusSalaryPerHourOfOvertime=" + super.getBonusSalaryPerHourOfOvertime()
                + ", numberOfDishes=" + this.numberOfDishes + ", coefficientsBonusPerDishes=" + this.coefficientsBonusPerDishes + "]";
    }
    
}
