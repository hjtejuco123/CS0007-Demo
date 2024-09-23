import java.util.Scanner;
/**
 *
 * @author hadjitejuco
 */
public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //oop
        Calculator calculator = new Calculator();
        
        boolean exit = false;
        
        while(!exit){
            calculator.showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
        
            if (choice >=1 && choice <=4 ){
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                
                switch(choice){
                    case 1:
                        System.out.println("Result: "+calculator.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: "+calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: "+calculator.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: "+calculator.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice...");

                }

            }else if (choice == 5) {
                exit = true;
                System.out.println("Exit the program...");
            }else{
                System.out.println("Invalid choice .... ");
            }
        
        }
        scanner.close();
        
    }
}
