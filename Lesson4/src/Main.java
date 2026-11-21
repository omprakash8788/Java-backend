
public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
            "Rahul",
            101,
            50000
        );

        System.out.println("Initial details:");
        employee.displayDetails();

        System.out.println("\nUpdating employee:");

        employee.setName("Rahul Sharma");
        employee.setSalary(60000);

        employee.giveRaise(5000);

        System.out.println("\nUpdated details:");
        employee.displayDetails();

        System.out.println("\nCompany:");
        System.out.println(Employee.getCompanyName());

        // Try invalid data
        try {
            employee.setSalary(-10000);
        } catch (IllegalArgumentException exception) {
            System.out.println(
                "Validation error: " + exception.getMessage()
            );
        }

        // This will not compile:
        // employee.salary = -10000;

        // This will not compile:
        // employee.employeeId = 202;
    }
}
