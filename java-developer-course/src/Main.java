public class Main {
    public static void main(String[] args) {

        // Student student1 =new Student("OP", 12, "Java");
        // System.out.println("Student Details");
        // student1.displayDetails();
        // student1.displayCollege();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Op", 12);
        Employee emp3 = new Employee("kb", 12, 450.00);
        System.out.println("========== EMPLOYEE 1 ==========");
        emp1.displayDetails();
        Employee.displayCompanyName();

        System.out.println("========== EMPLOYEE 2 ==========");
        emp2.displayDetails();
        Employee.displayCompanyName();

        System.out.println("========== EMPLOYEE 3 ==========");
        emp3.displayDetails();
        Employee.displayCompanyName();
    }
}

