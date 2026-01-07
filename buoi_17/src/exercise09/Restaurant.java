package exercise09;

import java.util.ArrayList;

public class Restaurant extends ArrayList<Employee> {
    
    public Restaurant() {
    }

    public void showAllEmployees() {
        for (Employee e : this) {
            System.out.println(e);
        }
    }

    public void addEmployee(Employee emp) {
        for (Employee e : this) {
            if (e.getId().equals(emp.getId())) {
                return;
            }
        }

        super.add(emp);
    }

    public void updateEmployee(Employee emp) {
        // for (Employee e : this) {
        //     if (e.getId().equals(emp.getId())) {
        //         if (e instanceof Chef && !(emp instanceof Chef)) {
        //             return;
        //         }
        //         if (e instanceof Waiter && !(emp instanceof Waiter)) {
        //             return;
        //         }
        //         if (e instanceof Manager && !(emp instanceof Manager)) {
        //             return;
        //         }

        //         e.setName(emp.getName());
        //         e.setHourOfTimeserving(emp.getHourOfTimeserving());
        //         e.setSalaryPerHourOfTimeserving(emp.getSalaryPerHourOfTimeserving());
        //         e.setHourOfOvertime(emp.getHourOfOvertime());
        //         e.setBonusSalaryPerHourOfOvertime(emp.getBonusSalaryPerHourOfOvertime());

        //         // Update child class related
        //         if (e instanceof Chef) {
        //             ((Chef)e).setNumberOfDishes(((Chef)emp).getNumberOfDishes());
        //             ((Chef)e).setCoefficientsBonusPerDishes(((Chef)emp).getCoefficientsBonusPerDishes());
        //         }
        //         if (e instanceof Waiter) {

        //         }

        //         return;
        //     }
        // }

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId().equals(emp.getId())) {
                this.set(i, emp);
                return;
            }
        }
    }

    public void removeEmployeeById(String id) {
        for (Employee e : this) {
            if (e.getId().equals(id)) {
                this.remove(e);
                return;
            }
        }
    }

    public Employee searchEmployeeById(String id) {
        for (Employee e : this) {
            if (e.getId().equals(id)) {
                return e;
            }
        }

        return null;
    }

}