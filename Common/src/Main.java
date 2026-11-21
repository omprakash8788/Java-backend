public class Main{
    public static void main(String[] args) {
        
        Developer developer = new Developer(1, "Raju", 54.00, "Java");


        Manager manager = new Manager(2, "Ravi", 10.00, "manage");

    System.out.println("=============");

    developer.displayDetails();
    developer.writeCode();
     
        System.out.println("=============");

        manager.displayDetails();
        manager.managerActivity();

    }

}