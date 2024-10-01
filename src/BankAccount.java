/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class BankAccount {
    private String accountNumber; //attribute
    private double balance;
                //              123
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;  //123
        this.balance = 0;
    }
                //          500
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited "+amount); //500
        }else{
            System.out.println("Value should be positive.");
        }
        
    }
                //              200
    public void withdraw(double amount) {
        if (amount > 0 && amount <=balance){
            balance -= amount;      //300
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
        //input 123
        BankAccount account = new BankAccount(accountNumber);
        account.deposit(500);
        account.withdraw(200);
        
        System.out.println("Current Balance is "+account.checkBalance());
        scanner.close();
    }    
    
}
