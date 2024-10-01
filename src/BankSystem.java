
import java.util.Scanner;
public class BankSystem {
    private String accountNumber;
    private double balance;
    
    //Constructor
    public BankSystem(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited "+amount);
        }else{
            System.out.println("Deposit must be positive.");
        }

    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Insufficient balance.");
        }
    }
    
    public double checkBalance(){
        return balance;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String accountNumber = scanner.nextLine();
        BankSystem account = new BankSystem(accountNumber);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance is "+account.checkBalance());
        scanner.close();
    }
    
    
    
}
