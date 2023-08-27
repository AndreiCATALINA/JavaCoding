package Exercises;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Nume: " + employee.getName() +
                    ", Email: " + employee.getEmail() +
                    ", Salariu: " + employee.getSalary());
        }
    }

    public void displayEmployeesWithExperience(int years) {
        for (Employee employee : employees) {
            if (LocalDate.now().minusYears(years).isAfter(employee.getHireDate())) {
                System.out.println("Nume: " + employee.getName() +
                        ", Vechime: " + (LocalDate.now().getYear() - employee.getHireDate().getYear()) + " ani");
            }
        }
    }

    public void increaseSalariesAnnually() {
        for (Employee employee : employees) {
            employee.increaseSalary();
        }
    }

    public void displaySalaryHistory(Employee employee) {
        System.out.println("Istoric salarial pentru " + employee.getName() + ":");
        for (Employee emp : employees) {
            if (emp == employee) {
                System.out.println(emp.getSalaryHistory());
            }
        }
    }
}
