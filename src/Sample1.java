/**
 * Arithmetic Operators
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt
        System.out.println("Enter first number: ");
        //input
        int number1 = scanner.nextInt();
        //prompt
        System.out.println("Enter second number: ");
        //input
        int number2 = scanner.nextInt();
        //perform airthmetic operators 
        //int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient = (double)number1 / number2;
        int modulus = number1 % number2;
     
        //display the result
        //sout+tab
        System.out.println("Sum: "+(number1+number2));
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Modulus: "+modulus);
        
        scanner.close();
    }
    
}
