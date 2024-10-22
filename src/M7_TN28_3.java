
//banking system 
//deposit / withdraw
//ask for the AccountName
//ask for the balance
public class M7_TN28_3 {
    String accountHolderName;
    double balance;

    //Constructor
    public M7_TN28_3(String accountHolderName, double initbalance){
        this.accountHolderName = accountHolderName;
        this.balance = initbalance;
    }
    public void displayAccountInfo(){
        System.out.println("Account Holder "+accountHolderName);
        System.out.println("Balance "+balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount is "+amount);
        System.out.println("---------------------");
    }
    
    public void deposit(double amount, String note){
        balance += amount;
        System.out.println("Deposited Amount is "+amount);
        System.out.println("Note "+note);
        System.out.println("----------------------");
    }
    
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Insufficient balance ");
        }
    
    }
   
}
