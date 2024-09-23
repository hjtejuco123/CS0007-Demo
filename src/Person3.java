/**
 * Constructors overloading
 * @author hadjitejuco
 */
public class Person3 {
    String name;
    int age;
    
    //default constructor
    public Person3(){
        name = "Unknown";
        age = 0;
    }
    
    //parameter constructor
    public Person3(String name){
        this.name = name;
        age = 0; //default age
    }
    
    //two args
    public Person3(String name, int age){
        this.name = name;
        this.age = age;
    }
    
     public void displayDetails(){
        System.out.println("Name: "+name+" Age "+age);
    }
}
