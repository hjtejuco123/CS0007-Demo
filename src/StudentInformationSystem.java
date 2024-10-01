
import java.util.Scanner;
public class StudentInformationSystem {
    private String name;
    private int age;
    private double grade;
    
    
    public StudentInformationSystem(String name, int age, double  grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
    }
            

    public void setName(String name){
        this.name = name;
    }
    
     public void setAge(int age){
        if (age>0){
            this.age = age;
        }else{
            System.out.println("Invalid age, Age must be positive...");
        }
    }
    
     
    public void setGrade(double grade){
        if (grade>=0 && grade <=100){
            this.grade = grade;
        }else{
              System.out.println("Invalid Grade....Must be from 0 to 100");
        }
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        
        StudentInformationSystem sis= new StudentInformationSystem(name, age, grade);
        sis.displayDetails();
        
        System.out.println("Update Record...");
        System.out.print("Enter Updated Name: ");
        scanner.nextLine(); //clear buffer
        sis.setName(scanner.nextLine());
        
        System.out.print("Enter Updated Age: ");
        sis.setAge(scanner.nextInt());

        System.out.print("Enter Updated Grade: ");
        sis.setGrade(scanner.nextDouble());
        
        sis.displayDetails();
        
        
    }
}
