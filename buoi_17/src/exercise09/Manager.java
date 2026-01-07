package exercise09;

public class Manager extends Employee {
    
    private double bonusRate;
    private double kpiPoint;
    private double kpiThreshold;

    public Manager(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving, int hourOfOvertime,
        double bonusSalaryPerHourOfOvertime, double bonusRate, double kpiPoint, double kpiThreshold) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.bonusRate = bonusRate;
        this.kpiPoint = kpiPoint;
        this.kpiThreshold = kpiThreshold;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double getKpiPoint() {
        return kpiPoint;
    }

    public void setKpiPoint(double kpiPoint) {
        this.kpiPoint = kpiPoint;
    }

    public double getKpiThreshold() {
        return kpiThreshold;
    }

    public void setKpiThreshold(double kpiThreshold) {
        this.kpiThreshold = kpiThreshold;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() * (1 + this.bonusRate * (this.kpiPoint / this.kpiThreshold));
    }

    @Override
    public String toString() {
        return "Manager [id=" + super.getId() + ", name=" + super.getName() + ", hourOfTimeserving=" + super.getHourOfTimeserving()
                + ", salaryPerHourOfTimeserving=" + super.getSalaryPerHourOfTimeserving() + ", hourOfOvertime=" + super.getHourOfOvertime()
                + ", bonusSalaryPerHourOfOvertime=" + super.getBonusSalaryPerHourOfOvertime()
                + ", bonusRate=" + this.bonusRate + ", kpiPoint=" + this.kpiPoint + ", kpiThreshold=" + this.kpiThreshold + "]";
    }

}
