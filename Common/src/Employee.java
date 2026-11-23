public abstract class Employee {
    private final int employeeId;
    private  String name;
    private  double salary;

    public Employee(int employeeId, String name, double salary){

        if(employeeId < 0){
            throw new IllegalArgumentException("Employee Is must be positive");
        }
        if(name ==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if(salary<0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
       

        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }

    public abstract void work();

    public void displayDetails(){
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Employee Salary: " + salary);

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
      return salary;
    }
}
