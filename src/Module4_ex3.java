/**
 * Calculator (using switch)
 *  ask the user to input 2 numbers
 *  ask the user to enter the operator
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        //+,-,*,/ - char 
        System.out.print("Enter operator: +,-,*,/:  ");
        char operator = scanner.next().charAt(0);
        switch(operator){
            case '+':System.out.println("Result: "+(num1+num2));break;
            case '-':System.out.println("Result: "+(num1-num2));break;
            case '*':System.out.println("Result: "+(num1*num2));break;
            case '/':
                if (num2!=0){       
                    System.out.println("Result: "+(num1/num2));
                }else{
                    System.out.println("Error cannot divide by zero");      
                }
                break;
            default:
                System.out.println("Invalid operator...");
        }
        scanner.close();
    }
}
