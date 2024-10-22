//constructor overloading
//car application

public class TN29_M7_2 {
    String brand;
    String model;
    int year;
    double price;
    
    TN29_M7_2(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }
    
    TN29_M7_2(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }
    
    TN29_M7_2(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }
    TN29_M7_2(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public void displayInformation(){
        System.out.println("Brand: "+brand);
        System.out.println("Model "+model);
        System.out.println("Year "+year);
        System.out.println("Price "+price);
        System.out.println("---------------");
    }
    
    public static void main(String[] args) {
        TN29_M7_2 car1 = new TN29_M7_2();
        car1.displayInformation();
        TN29_M7_2 car2 = new TN29_M7_2("Toyota","Corolla");
        car2.displayInformation();
        TN29_M7_2 car3 = new TN29_M7_2("Honda","Civic", 2022);
        car3.displayInformation();
        TN29_M7_2 car4 = new TN29_M7_2("Tesla","Model S", 2024, 35000.00);
        car4.displayInformation();
        
    }
    
}
