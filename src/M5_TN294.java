/**
 * Default Constructor
 * @author hadjitejuco
 */
public class M5_TN294 {
    //attributes - variables
    String name;
    int age;
    
    //default constructor
    public M5_TN294(){
        name = "Unknown";
        age = 0;
    }
    
    public M5_TN294(String name, int age){
        this.name = name;
        this.age = age;
    }
        
    //custom method
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age "+age);
        System.out.println("---------");
    }
    
    
    
}
