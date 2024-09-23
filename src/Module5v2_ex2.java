/**
 * Calculator using functions
 * Enter 1st number and 2nd number ok
 * Choose the operation (+,-,*,/)
 * Display the result
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module5v2_ex2 {
    //functions
    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if (b==0){
            System.out.println("Error Division by Zero");
            return 0;
        }
        return a/b;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operation +,-,*,/: ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        switch(operation){
            case '+':
                result = add(num1,num2);
                break;
            case '-':
                result = subtract(num1,num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = division(num1,num2);
                break;
            default:
                System.out.println("Invalid opeation...");
                return;
        }
        System.out.println("Result: "+result);
    }
    
}
