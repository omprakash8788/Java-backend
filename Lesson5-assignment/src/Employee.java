public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;

    }

    public void displayDetails(){
       System.out.println("Emp Id Number: " + employeeId);
       System.out.println("Emp Name: " + name);
       System.out.println("Emp Salary: " + salary);


    }

    public void work(){
      System.out.println("I am parent");
    }
}
