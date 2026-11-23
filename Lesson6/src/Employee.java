
public abstract class Employee {

    private final int employeeId;
    private String name;
    private double salary;

    public Employee(
        int employeeId,
        String name,
        double salary
    ) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException(
                "Employee ID must be positive"
            );
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Employee name cannot be empty"
            );
        }

        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                "Salary cannot be negative or non-finite"
            );
        }

        this.employeeId = employeeId;
        this.name = name.trim();
        this.salary = salary;
    }

    // Abstract method
    public abstract void work();

    // Normal method
    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
