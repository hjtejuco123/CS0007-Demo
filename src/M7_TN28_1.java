
//Constructor Overloading
//brands for cars 
// brands, model, year, price

//Car model display 
public class M7_TN28_1 {
    String brand;
    String model;
    int year; 
    double price;
    
    //constructor with no parameters
    public M7_TN28_1(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }
    
    public M7_TN28_1(String brand, String model){
        //this.var = var - refers to the current object fields inside
        //the constructor
        this.brand = brand;
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }
    
    public M7_TN28_1(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }
    
    public M7_TN28_1(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public void displayInformation(){
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Year "+year);
        System.out.println("Price "+price);
        System.out.println("----------------");
    
    }
    
    
    public static void main(String[] args) {
        
        M7_TN28_1 car1 = new M7_TN28_1();
        car1.displayInformation();
        
        M7_TN28_1 car2 = new M7_TN28_1("Toyota","Corolla");
        car2.displayInformation();
        
        M7_TN28_1 car3 = new M7_TN28_1("Honda","Civic",2000);
        car3.displayInformation();
        
        M7_TN28_1 car4 = new M7_TN28_1("Tesla","Model S",2022,35000.00);
        car4.displayInformation();
        
    }
    
}
