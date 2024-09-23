
/**
 * static methods
 * @author hadjitejuco
 */
import java.util.Scanner;
public class ATMv3 {
    //account numbers
    static int[] accountNumbers = {123,456,789};
    static int[] accountPins = {111,222,333};
    static double[] accountBalances = {1000.0,2000.0,3000.0}; 
    
    public static int validateUser(int accountNumber, int pin){
        for (int i = 0; i < accountNumbers.length; i++){
            if (accountNumbers[i]==accountNumber&&accountPins[i]==pin){
                return i;
            }
        }
        return -1;
    }
    public static void checkBalance(int userIndex) {
        System.out.println("Your Current balance is "+accountBalances[userIndex]);
    }
    
    public static void deposit(int userIndex, double amount){
        if (amount > 0){
            accountBalances[userIndex] += amount; 
            System.out.println("Deposit successful "+accountBalances[userIndex]);
        }else{
            System.out.println("Invalid Deposit amount ");
        }
    }
    
    public static void withdraw(int userIndex, double amount){
        if (amount > 0 && amount <= accountBalances[userIndex]){
            accountBalances[userIndex] -= amount; 
            System.out.println("Withdraw successul "+accountBalances[userIndex]);
        }else if (amount >accountBalances[userIndex]) {
            System.out.println("Inssufiencient funds ");
        }else{
            System.out.println("Invalid withdrawal ");
        }
    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you account number ");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter your pin ");
        int pin = scanner.nextInt();
        
        int userIndex = validateUser(accountNumber,pin);
        
        if (userIndex != -1){
            System.out.println("Login in successfully ");
        
            boolean exit = false;
            
            while(!exit){
                System.out.println("ATM MENU");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                
                switch(choice){
                    case 1:
                        checkBalance(userIndex);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit ");
                        double depositAmount = scanner.nextDouble();
                        deposit(userIndex, depositAmount);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(userIndex, withdrawAmount);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Invalid ");
                
                }
            }
            
        }else{
            System.out.println("Invalid account and Pin");
        }
        scanner.close();
        
    }
    
}
