/**
 * Constructors
 * default, parameterized constructor, constructor overloadin
 * @author hadjitejuco
 */
public class M5_TN210_4 {
    //attributes
    String model;
    int year;
    
    //default constructor
    public M5_TN210_4(){
        model = "Unknown";
        year = 0;
    }
    //parameterized constructor
    public M5_TN210_4(String model, int year){
        this.model = model;
        this.year = year;
    }
    
    
    //display
    public void displayDetails(){
        System.out.println("Models "+model);
        System.out.println("Year "+year);
        System.out.println("------");
    
    }
    public static void main(String[] args) {
        //create object
        //calls for the default constructor
        M5_TN210_4 obj1 = new M5_TN210_4();
        M5_TN210_4 obj2 = new M5_TN210_4("Iphone16",2024);
        M5_TN210_4 obj3 = new M5_TN210_4("Samsung",2025);
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
           
}
