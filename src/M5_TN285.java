/**
 * Encapsulation (hiding)
 * Mutator - Setter (assign data) set
 * Accessor - Getter (retrieve data) get
 * @author hadjitejuco
 */
public class M5_TN285 {
    //attributes -> variables
    private String name;
    private int id;
    private double salary;
    
    //Constructor
    //                  "Hadji",    101,        500.00
    public M5_TN285(String name, int id, double salary){
        this.name = name;  
        this.id = id;
        this.salary = salary;
    }
    
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //getter for name
    public String getName(){
        return name;
    }
    
    //setter for id
    public void setId(int id) {
        this.id = id;
    }
    //getter for id
    public int getId(){
        return id;
    }
    
    //setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }else{
            System.out.println("Invalid Salary...");
        }
    }
    //getter for id
    public double getSalary(){
        return salary;
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
