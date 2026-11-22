// Parent 

public class Employee{
    // id, name, salary
    private int employeeId;
    private String name;
    private  double salary;

   public Employee(int employeeId, String name, double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
   }
   
   public void displayDetails(){
    System.out.println("Employee Id: " + employeeId);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary);
   }

   public final void work(){
     System.out.println("Employee Working");
   }

}