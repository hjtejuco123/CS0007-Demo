/**
 * ATM System
 * @author hadjitejuco
 */
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true; //flag control the loop
        int choice;
        double accountBalance = 1000.0; //default balance
        double depositAmount;
        double withdrawAmount;
        do{
            System.out.println("HJT ATM System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("You current account balance is "+accountBalance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        accountBalance += depositAmount;
                        System.out.println("New balance is "+accountBalance);
                    }else {
                        System.out.println("Invalid amount, please enter a positive amount");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= accountBalance) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Successfully withdrew "+withdrawAmount);
                        System.out.println("New current balance is "+accountBalance);
                    }else if (withdrawAmount > accountBalance){
                        System.out.println("Insufficient balance, cannot withdraw "+withdrawAmount);
                    
                    }else{
                        System.out.println("Invalid withdrawal amount, Please enter a positive amount ");
                    }
                    
                    break;
                case 4:
                    System.out.println("Thank you...");
                    isRunning = false; //exit the program
                    break;
                default:
                    System.out.println("Invalid choice ");
            }
            
        }while(isRunning);
        scanner.close();
        
    }
}
