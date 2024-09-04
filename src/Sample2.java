/**
 * Relational and Logical Operators
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Sample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Are you a member (true/false): ");
        boolean isMember = scanner.nextBoolean();
        //if age >= 60 age >=18
        
        //T     F      FAND         TOR
        //t     t       t           t      
        //t     f       f           t
        //f     t       f           t
        //f     f       f           f
                    
        boolean isEligibleForDiscount = (age>=60) || (isMember && age>=18); 
        
        if (isEligibleForDiscount) {
            System.out.println("You are eligible for a discount.");
        }else{
            System.out.println("You are not eligible for a discount.");
        }
        
        scanner.close();
    }
}
