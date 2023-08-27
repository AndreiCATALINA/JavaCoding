package Exercises;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee emp1 = new Employee(LocalDate.of(2010, 5, 10), "John", "john@example.com", 2500);
        Employee emp2 = new Employee(LocalDate.of(2015, 7, 20), "Jane", "jane@example.com", 3000);
        Employee emp3 = new Employee(LocalDate.of(2018, 3, 15), "Alex", "invalid-email", 2800);

        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);

        company.displayAllEmployees();
        company.displayEmployeesWithExperience(3);

        emp1.increaseSalary();
        emp2.increaseSalary();
        company.increaseSalariesAnnually();

        company.displayAllEmployees();

        company.displaySalaryHistory(emp1);
        company.displaySalaryHistory(emp2);

        if (emp3.isValidEmail()) {
            System.out.println("Employee " + emp3.getName() + " has a valid email.");
        } else {
            System.out.println("Employee " + emp3.getName() + " has an invalid email.");
        }
    }
}
