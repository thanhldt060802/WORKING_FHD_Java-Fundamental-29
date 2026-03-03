public class ParttimeEmployee extends Employee {

    private int numberOfWorkDay;

    public ParttimeEmployee(String id, String name, int age, int baseSalary, int numberOfWorkDay) {
        super(id, name, age, baseSalary);
        this.numberOfWorkDay = numberOfWorkDay;
    }

    public int getNumberOfWorkDay() {
        return numberOfWorkDay;
    }
    
    public void setNumberOfWorkDay(int numberOfWorkDay) {
        this.numberOfWorkDay = numberOfWorkDay;
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary() * 6 * this.numberOfWorkDay;
    }
    
}
