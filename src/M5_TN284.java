/**
 * Default and Parameterized Constructor
 * @author hadjitejuco
 */
public class M5_TN284 {
    //attributes
    String name;
    int id;
    double salary;
    
    //default constructor
    public M5_TN284(){
        name = "Not Assigned ";
        id = 0;
        salary = 0.0;
    }
    
    //Parameterized Constructor
    public M5_TN284(String name, int id, double salary){
         this.name = name;
         this.id = id;
         this.salary = salary;    
    }
     
     //method to display
     public void displayDetails(){
         System.out.println("----------------");
         System.out.println("Name: "+name);
         System.out.println("ID: "+id);
         System.out.println("Salary: "+salary);
         System.out.println("----------------");
     }
}