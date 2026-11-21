public class Employee {

    String name;
    int employeeId;
    double salary;

    static String companyName = "TechCorp";

    public Employee() {
        this.name = "Unknown";
        this.employeeId =0;
        this.salary =0.0;
    }

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;

    }

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;

    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);

        System.out.println("EmployeeId: " + this.employeeId);

        System.out.println("Salary: " + this.salary);

    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

}
