/**
 * method to compute for +,-,*,/
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Calculator {
    //add class
    public int add(int a, int b){
        return a+b;
    }
    
    public int subtract(int a, int b){
        return a-b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public int divide(int a, int b){
        Scanner scanner = new Scanner(System.in);
        while(b==0) {
            System.out.println("Error: Division by zero, Please enter a number ");
            System.out.print("Enter second number: ");
            b = scanner.nextInt();
        }
        return a/b;
        
    }
    
    public void showMenu(){
        System.out.println("\nCalculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");     
    }
}
