/**
 * Ternary Operator
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        
        number += 5; 
        System.out.println("After the inc the value is "+number);
        
        String result = (number %2 == 0)? "Even":"Odd";
        System.out.println("The number is "+result);

        scanner.close();
    }
}
