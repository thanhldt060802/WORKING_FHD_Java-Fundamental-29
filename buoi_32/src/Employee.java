public abstract class Employee {

    private String id;
    private String name;
    private int age;
    private int baseSalary;

    public Employee(String id, String name, int age, int baseSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();
    
}
