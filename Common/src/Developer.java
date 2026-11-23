public class Developer extends Employee{
     
    private String programming;

    public Developer(int employeeId, String name, double salary, String programming){
     super(employeeId, name, salary);

     this.programming="Java";

    }

    @Override 
    public void work(){
        System.out.println(getName() +"Developer write code");
    }

}
