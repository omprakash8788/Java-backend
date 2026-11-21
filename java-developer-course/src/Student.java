public class Student{
    private String name;
    private int age;
    private String course;

    private static String college = "IIT Patna";

    public Student(String name, int age, String course){
     this.name = name;
     this.age = age;
     this.course=course;
    }

    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
        

    }
   
    public static  void displayCollege(){
      System.out.println("College: " + college);
    }
    
}