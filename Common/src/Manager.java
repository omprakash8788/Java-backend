public class Manager extends Employee{
     
    private int teamSize;

    public Manager(int employeeId, String name, double salary, int teamSize){
     super(employeeId, name, salary);

     this.teamSize=5;

    }

    @Override 
    public void work(){
        System.out.println(getName() +"Manager manage team");
    }

}
