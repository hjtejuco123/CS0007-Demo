
import java.util.Scanner;
public class GasStation {
    private final double pricePerLiter = 2.50;
    
    //method calculateTotal  
    //                              5
    
    //if the attribute pricePerlitter is
    //private double pricePerLiter = 2.50;
    //we ca still update the value, but since
    //we use the final keyword, its now read-only
    
    //constructor
//  public GasStation(){
//        this.pricePerLiter = 3.0;
//  }
    
    
    public double calculateTotal(double liter){
               // 5  *  2.50
        return liter * pricePerLiter;
    }
    
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasStation station = new GasStation();
        
        System.out.print("Enter number of liters: ");
        double liter = scanner.nextDouble();
        
        double total = station.calculateTotal(liter);
        System.out.println("Total Cost "+total);
    }
    
    
}
