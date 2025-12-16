public class Main {

    public static void main(String[] args) {
        
        // Person p = new Person();  // original object

        // Person p1 = new Student_A1();  // polymorphic object

        // Person p2 = new Student_A2();  // polymorphic object
        
        // Employee e;
		
		// // e = new Employee();
		// // e.calculateSalary();

		// // e = new Technician();
		// // e.calculateSalary();

		// // e = new Developer();
		// // e.calculateSalary();

		// // e = new DevOps();
		// // e.calculateSalary();

		// // e = new Manager();
		// // e.calculateSalary();

		// // e = new Designer();
		// // e.calculateSalary();

        // Employee e = new Employee("01", 100);
        // Employee e = new Developer("01", 100);
        // Manager m = new Manager("01", 100);
        // showEmployeeSalary(m);  // e = m

        // Developer dev = new Developer("01", 100);
        // Designer des = new Designer("02", 100);
        // Technician tech = new Technician("03", 100);

        // System.out.println(dev);
        // System.out.println(des);
        // System.out.println(tech);

        // // Employee e = new Manager("01", 100); // Chiều gọi: [Manager->Developer->Employee->Object]
        // //                                                     // Chiều hình thành: [Object->Employee->Developer->Manager]
        // Employee e = new DevOps("01", 100); // Chiều gọi: [DevOps->Developer->Employee->Object]
        //                                                    // Chiều hình thành: [Object->Employee->Developer->DevOps]
        // System.out.println(e);

        // Employee e = new Manager("01", 100); // polymorphic object (up-casting)
        //                                                     // [Object->Employee->Developer->Manager]
        // ((Developer)e).greetingFromDeveloper();
        // ((Manager)e).greetingFromManager();

        Employee e = new Developer("01", 100); // polymorphic object (up-casting)
                                                              // [Object->Employee->Developer]
        if (e instanceof Developer) {
            ((Developer)e).greetingFromDeveloper();
        }
        if (e instanceof Manager) {
            ((Manager)e).greetingFromManager();
        }
        if (e instanceof String) {
            
        }

    }

    public static void showEmployeeSalary(Employee e) {
        System.out.println(e.calculateSalary());
    }

}
