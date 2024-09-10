/**
 * test if the user is eligible to vote
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
          
        
        
    }
}
