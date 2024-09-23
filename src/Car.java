/**
 * Car - make, model, year 
 * 
 * @author hadjitejuco
 */
public class Car {
    String make;
    String model;
    int year;
    
    //Constructor(initialize the car object
    public Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //method
    public void displayInfo(){
        System.out.println("Car: "+make+" "+model+ ",Year "+year);
    
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("Honda","Civic",2020);
        Car car2 = new Car("Toyota","Innova",2025);
        car1.displayInfo();
        car2.displayInfo();
    }
    
}
