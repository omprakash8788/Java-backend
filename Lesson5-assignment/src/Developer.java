public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary, String programmingLanguage){
         super(employeeId, name, salary);
         this.programmingLanguage=programmingLanguage;

    }
    @Override 
    public void work(){
        System.out.println("Developer is writing code.");
    }
}
