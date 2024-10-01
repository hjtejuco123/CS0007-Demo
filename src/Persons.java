//Person
//Superclass
public class Persons {
    protected String name;
    protected int age;

    //Person    
    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }    
    
    public void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
    
}
