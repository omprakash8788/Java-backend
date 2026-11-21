public class Developer extends  Employee{

    private String programming =" programming";

    public Developer(int employeeId, String name, double salary, String programming){
         super(employeeId, name, salary);
         this.programming=programming;

    }

    public void writeCode(){
        System.out.println("Developer lan: " + programming);
    }
    @Override 
     public void work(){
     System.out.println("Developer Working");
   }

}