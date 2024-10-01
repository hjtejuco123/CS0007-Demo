
//subclass (will inherit from the Persons) 

public class Employee extends Persons {
    
    private double salary;
    
    public Employee (String name, int age, double salary){
        super(name, age); //call the superclass constructor
        this.salary = salary;
    }
        
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Salary is "+salary);
    }
}


