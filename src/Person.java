/**
 * Default Constructor
 * @author hadjitejuco
 */
public class Person {
    String name;
    int age;

    //Default Constructor
    public Person(){
        name = "Unknown";
        age = 0;
    }
    
    //method display information
    public void displayDetails(){
        System.out.println("Name: "+name+" Age "+age);
    }
}
