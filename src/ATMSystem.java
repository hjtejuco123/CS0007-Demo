/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double accountBalance = 1000.0;
        double depositAmount;
        double withdrawAmount;
        boolean isRunning = true;
        int choice;  
        
        do {
            System.out.println("HJT ATM MACHINE");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Your current Balance is"+accountBalance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    depositAmount = scanner.nextDouble();
                    
                    if (depositAmount > 0){
                        accountBalance += depositAmount;
                        System.out.println("You have deposited "+depositAmount);
                        System.out.println("Your New Balance is "+accountBalance);
                    }else{
                        System.out.println("Invalid Deposit ");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    withdrawAmount = scanner.nextDouble();
                   
                    if (withdrawAmount > 0 && withdrawAmount <= accountBalance) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Withdrew amount: "+withdrawAmount);
                        System.out.println("Current Balance: "+accountBalance);
                    }else if (withdrawAmount > accountBalance) {
                        System.out.println("Insufficient Balance...");
                    }else{
                        System.out.println("Invalid amount");
                    }                   
                    break;
                case 4:
                    System.out.println("Thank you...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            
            }

        }while(isRunning);
    
        scanner.close();
    }
}
