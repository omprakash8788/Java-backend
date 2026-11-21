
public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer(
            101,
            "Rahul",
            80000,
            "Java"
        );

        Manager manager = new Manager(
            102,
            "Priya",
            100000,
            8
        );

        System.out.println("=== DEVELOPER ===");

        developer.displayDetails();
        developer.writeCode();

        System.out.println("\n=== MANAGER ===");

        manager.displayDetails();
        manager.manageTeam();
    }
}
