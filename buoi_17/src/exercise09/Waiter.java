package exercise09;

public class Waiter extends Employee {
    
    private double rating;
    private double bonusSalary;

    public Waiter(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving, int hourOfOvertime,
        double bonusSalaryPerHourOfOvertime, double rating, double bonusSalary) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.rating = rating;
        this.bonusSalary = bonusSalary;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + this.bonusSalary * (this.rating / 5);
    }

    @Override
    public String toString() {
        return "Employee [id=" + super.getId() + ", name=" + super.getName() + ", hourOfTimeserving=" + super.getHourOfTimeserving()
                + ", salaryPerHourOfTimeserving=" + super.getSalaryPerHourOfTimeserving() + ", hourOfOvertime=" + super.getHourOfOvertime()
                + ", bonusSalaryPerHourOfOvertime=" + super.getBonusSalaryPerHourOfOvertime()
                + ", rating=" + this.rating + ", bonusSalary=" + this.bonusSalary + "]";
    }

}
