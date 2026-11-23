public class Main {
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Developer(1, "sadhu", 100.00, "Java"),
            new Manager(2, "deepali", 100000.00, 6),
            new Tester(3, "Rubi", 100.00, "QA")

        };

        for(Employee employee : employees){
            employee.displayDetails();
            employee.work();
        }

    }
}
