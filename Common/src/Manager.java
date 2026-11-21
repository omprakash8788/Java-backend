public class Manager extends Employee{
    private String manage = "Management";

    public Manager(int employeeId, String name, double Salary, String manage){
           super(employeeId, name, Salary);
           this.manage=manage;
    }

    public void managerActivity(){
        System.out.println("Manager activity: " + manage);
    }
}