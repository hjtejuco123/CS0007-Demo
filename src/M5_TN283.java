/**
 * 
 * @author hadjitejuco
 */
//car class
public class M5_TN283 {
    //attributes (variables/fields)
    String brand;
    String model;
    int year;
    
    //constructor - initialized variables
    //car class
    public M5_TN283(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //methods
    public void displayDetails(){
        System.out.println("Brand "+brand+ ", Model: "+model+ " Year: "+year);
    }
    
}
