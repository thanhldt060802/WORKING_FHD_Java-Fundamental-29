package exercise09;

import java.util.ArrayList;

public class Restaurant {

    private ArrayList<Employee> employeeList;
    
    public Restaurant() {
        this.employeeList = new ArrayList<Employee>();
    }

    public void showAllEmployees() {
        for (Employee e : this.employeeList) {
            System.out.println(e + ": " + e.calculateActualSalary());
        }
    }

    public void addEmployee(Employee emp) {
        for (Employee e : this.employeeList) {
            if (e.getId().equals(emp.getId())) {
                return;
            }
        }

        this.employeeList.add(emp);
    }

    public void updateEmployee(Employee emp) {
        for (int i = 0; i < this.employeeList.size(); i++) {
            if (this.employeeList.get(i).getId().equals(emp.getId())) {
                this.employeeList.set(i, emp);
                return;
            }
        }
    }

    public void removeEmployeeById(String id) {
        for (Employee e : this.employeeList) {
            if (e.getId().equals(id)) {
                this.employeeList.remove(e);
                return;
            }
        }
    }

    public Employee searchEmployeeById(String id) {
        for (Employee e : this.employeeList) {
            if (e.getId().equals(id)) {
                return e.copy();
            }
        }

        return null;
    }

    public ArrayList<Employee> searchEmployeeWithRoleByChef() {
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Employee e : this.employeeList) {
            if (e instanceof Chef && ((Chef)e).getNumberOfDishes() >= 3) {
                result.add(e);
            }
        }
        return result;
    }

    public ArrayList<Employee> searchEmployeeWithRoleByWaiter() {
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Employee e : this.employeeList) {
            if (e instanceof Waiter) {
                result.add(e);
            }
        }
        return result;
    }

    public ArrayList<Employee> searchEmployeeWithRoleByManager() {
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Employee e : this.employeeList) {
            if (e instanceof Manager) {
                result.add(e);
            }
        }
        return result;
    }

    public void sortByHourOfTimeservingAscending() {
        for (int i = 0; i < this.employeeList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < this.employeeList.size(); j++) {
                if (this.employeeList.get(j).getHourOfTimeserving() < this.employeeList.get(minIndex).getHourOfTimeserving()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Employee temp = this.employeeList.get(i);
                this.employeeList.set(i, this.employeeList.get(minIndex));
                this.employeeList.set(minIndex, temp);
            }
        }
    }

    public void sortByActualSalaryAscending() {
        for (int i = 0; i < this.employeeList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < this.employeeList.size(); j++) {
                if (this.employeeList.get(j).calculateActualSalary() < this.employeeList.get(minIndex).calculateActualSalary()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Employee temp = this.employeeList.get(i);
                this.employeeList.set(i, this.employeeList.get(minIndex));
                this.employeeList.set(minIndex, temp);
            }
        }
    }

    public void sortByIdAscending() {
        for (int i = 0; i < this.employeeList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < this.employeeList.size(); j++) {
                if (this.employeeList.get(j).getId().compareTo(this.employeeList.get(minIndex).getId()) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Employee temp = this.employeeList.get(i);
                this.employeeList.set(i, this.employeeList.get(minIndex));
                this.employeeList.set(minIndex, temp);
            }
        }
    }

}