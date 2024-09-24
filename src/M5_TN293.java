/**
 * 
 * @author hadjitejuco
 */
//car class
public class M5_TN293 {
    //attributes
    String brand;
    String name;
    int year;
        
    //constructor
    public M5_TN293(String brand, String name, int year){
        this.brand = brand;
        this.name = name;
        this.year = year;
    }
    //custom method
    public void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
        System.out.println("-------");
        
    }
    
}
