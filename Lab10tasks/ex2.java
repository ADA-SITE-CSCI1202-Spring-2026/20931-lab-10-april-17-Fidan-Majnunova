import java.util.*;
import java.util.function.Function;

public class ex2 {
    static class Employee {
        String firstName;
        String lastName;
        double salary;

        public Employee(String firstName, String lastName, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public double getSalary() {
            return salary;
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Doe", 50000));
        employees.add(new Employee("Jane", "Smith", 60000));
        employees.add(new Employee("Emily", "Johnson", 55000));

        Function<Employee, String> formatCard = e ->
                "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = e -> e.getSalary();

        for (Employee e : employees) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary: $" + salaryPicker.apply(e));
        }
    }
}