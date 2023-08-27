package Exercises;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private LocalDate hireDate;
    private String name;
    private String email;
    private double salary;

    public Employee(LocalDate hireDate, String name, String email, double salary) {
        this.hireDate = hireDate;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary() {
        salary *= 1.05; // Increase by 5%
    }

    public String getSalaryHistory() {
        return String.format("Anul %d: %.2f lei", hireDate.getYear(), salary);
    }

    public boolean isValidEmail() {
        // Regular expression pattern for a simple email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
