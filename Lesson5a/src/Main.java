public class Main {

    public static void main(String[] args) {

        Employee[] employees = {

            new Developer(101, "Rahul", 80000.0, "JAva"),

            new Manager(102, "Priya", 100000.0, "Js"),

            new Developer(103, "Amit", 75000.0,"Science")
        };

        for (Employee employee : employees) {

            employee.work();
        }
    }
}