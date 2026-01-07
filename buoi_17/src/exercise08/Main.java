package exercise08;
import java.util.ArrayList;

import exercise09.Restaurant;

public class Main {

    public static void main(String[] args) {

        Employee x1 = new Employee("E01", "A", 500, 2.5);
		Employee x2 = new Developer("E02", "B", 500, 2.5, 69, 5.9); // [Object->Employee->Developer]
		Employee x3 = new Designer("E03", "C", 500, 2.5, 10, 5, 15.9, 8.9);
		Employee x4 = new Manager("E04", "D", 500, 2.5, 0.4);

		// System.out.println(x1);
		// System.out.println("Actual salary: " + x1.calculateActualSalary());

		// System.out.println();

		// System.out.println(x2);
		// System.out.println("Actual salary: " + x2.calculateActualSalary());

		// System.out.println();

		// System.out.println(x3);
		// System.out.println("Actual salary: " + x3.calculateActualSalary());

		// System.out.println();

		// System.out.println(x4);
		// System.out.println("Actual salary: " + x4.calculateActualSalary());

        // ArrayList<Employee> list = new ArrayList<Employee>();
        // list.add(x1);
        // list.add(x2);
        // list.add(x3);
        // list.add(x4);

        // for (Employee e : list) {
        //     if (e.calculateActualSalary() > 1500) {
        //         System.out.println(e);
        //         System.out.println(e.calculateActualSalary());
        //     }
        // }

    }

}
