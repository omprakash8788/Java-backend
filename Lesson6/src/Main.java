
public class Main {

    public static void main(String[] args) {

        // This is valid: parent reference, child object
        Employee[] employees = {

            new Developer(
                101,
                "Rahul",
                80000,
                "Java"
            ),

            new Manager(
                102,
                "Priya",
                100000,
                8
            ),

            new Tester(
                103,
                "Amit",
                60000,
                "Selenium"
            )
        };

        for (Employee employee : employees) {

            System.out.println("-------------------");

            employee.displayDetails();

            employee.work();
        }
    }
}
