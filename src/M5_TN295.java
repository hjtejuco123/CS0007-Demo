
/**
 * Encapsulation
 * Mutator(assign) and Accessor(retrieve)
 *     set                  get  
 * 
 * @author hadjitejuco
 */
public class M5_TN295 {
    //attributes
    private String name;
    private int id;
    private double salary;
    
    public M5_TN295 (String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    } 
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("---------");
    }
    
    //setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    //setters and getters
    public void setId(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
    
    //setters and getters
    public void setSalary(double salary){
        if (salary > 0){
            this.salary = salary;
        }else{
            this.salary = salary;
            System.out.println("Invalid Salary...");
        }
    }
   
    public double getSalary(){
        return salary;
    }
    
    
    
}
