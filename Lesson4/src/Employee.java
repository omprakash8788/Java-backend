
public class Employee {

    // Private fields: cannot be accessed directly from Main
    private final int employeeId;
    private String name;
    private double salary;

    private static final String COMPANY_NAME = "TechCorp";

    // Constructor
    public Employee(String name, int employeeId, double salary) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException(
                "Employee ID must be positive"
            );
        }

        this.employeeId = employeeId;
        this.name = validateName(name);
        this.salary = validateSalary(salary);
    }

    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = validateName(name);
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = validateSalary(salary);
    }

    // Static getter for company name
    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    // Business operation
    public void giveRaise(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Raise amount must be a positive finite number"
            );
        }

        this.salary = this.salary + amount;
    }

    // Private validation methods
    private static String validateName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Employee name cannot be empty"
            );
        }

        return name.trim();
    }

    private static double validateSalary(double salary) {

        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                "Salary must be a non-negative finite number"
            );
        }

        return salary;
    }

    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + COMPANY_NAME);
    }
}
