public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Developer(1, "op", 10.00, "Java"),
                new Manager(2, "op", 10.00, 10),
                new Tester(3, "op", 10.00, "Jira")

        };

        for (Employee employee : employees) {
            employee.displayDetails();
            employee.work();
        }
    }

}
