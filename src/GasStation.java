
import java.util.Scanner;
public class GasStation {
    private final double pricePerLiter = 2.50;
    
    //method calculateTotal  
    public double calculateTotal(double liter){
        
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
