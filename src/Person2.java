/**
 * Parameter Constructor
 * @author hadjitejuco
 */
public class Person2 {
    String name;
    int age;
    
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Method to display
     public void displayDetails(){
        System.out.println("Name: "+name+" Age "+age);
    }
}
