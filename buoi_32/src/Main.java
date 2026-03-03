public class Main {
    
    public static void main(String[] args) {
        
        // Person p = new Person("12345", "Thanh", 29);
        // p.info();

        // XeBay xe = new XeBay();  // Object -> XeGanMay -> XeBay
        // XeGanMay xe =  new XeGanMay("12345", "Mau do", 100);
        // XeBay xe = new XeBay("12345", "Mau hong", 100, "Thep");
        // xe.chay();
        // xe.bay();
        // xe.phanh();
        // System.out.println(xe);

        // Employee emp1 = new ParttimeEmployee("12345", "Thanh", 29, 21000, 15);
        // Employee emp2 = new FulltimeEmployee("54321", "Thang", 30, 25000, 2.5);

        // // System.out.println(emp1.getSalary());
        // // System.out.println(String.format("%.0f", emp2.getSalary()));
        // showSalaryOfEmployee(emp1);
        // showSalaryOfEmployee(emp2);

        // System.out.println(Flyable.id);

        Fish fish = new Fish();
        Duck duck = new Duck();

        doFly(duck);
        doSwim(duck);

    }

    // public static void showSalaryOfEmployee(Employee emp) {
    //     System.out.printf("%.0f\n", emp.getSalary());
    // }

    public static void doFly(Flyable flyableObj) {
        flyableObj.fly();
    }

    public static void doSwim(Swimmable swimmableObject) {
        swimmableObject.swim();
    }

}
