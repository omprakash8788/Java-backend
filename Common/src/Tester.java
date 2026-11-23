public class Tester extends Employee{
     
    private String test;

    public Tester(int employeeId, String name, double salary, String test){
     super(employeeId, name, salary);

     this.test="Playwrite";

    }

    @Override 
    public void work(){
        System.out.println(getName() + "QA testing");
    }

}
