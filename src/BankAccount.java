/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class BankAccount {
    private String accountNumber; //attribute
    private double balance;
    
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited "+amount);
        }else{
            System.out.println("Value should be positive.");
        }
        
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Insufficient balance or amount");
        }
        
    }
    
    public double checkBalance(){
        return balance;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber=scanner.nextLine();
        
        BankAccount account = new BankAccount(accountNumber);
        account.deposit(500);
        account.withdraw(200);
        
        System.out.println("Current Balance is "+account.checkBalance());
        scanner.close();
    }    
    
}
