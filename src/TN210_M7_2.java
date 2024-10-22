

//Constructor Overloading
//PRogram to display the brand, model, year and price
//cars
public class TN210_M7_2 {
    String brand;
    String model;
    int year;
    double price;

    //constructor no parameter
    TN210_M7_2(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }
    
    TN210_M7_2(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }
    
    TN210_M7_2(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }
    
    TN210_M7_2(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }    
    void displayInformation(){
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Year "+year);
        System.out.println("Price "+price);
        System.out.println("----------------");
        
    }
    
    
    public static void main(String[] args) {
        //created an object named car1
        TN210_M7_2 car1 = new TN210_M7_2();
        car1.displayInformation();
        
        TN210_M7_2 car2 = new TN210_M7_2("Toyota", "Corolla");
        car2.displayInformation();
        
        TN210_M7_2 car3 = new TN210_M7_2("Honda", "Civic", 2024);
        car3.displayInformation();
        
        TN210_M7_2 car4 = new TN210_M7_2("Tesla", "Model S", 2024, 23500.00);
        car4.displayInformation();
        
    }
      
}
