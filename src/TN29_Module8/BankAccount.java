package TN29_Module8;

public class BankAccount {
    private double balance;
    
    public BankAccount(double balance){
        this.balance = balance;
    
    }
    
    //withdraw
    public void withdraw(double amount)throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException ("Insufficient balance");
        }else{
            balance -= amount;
            System.out.println("new balance is "+balance);
        }
    
    }
    
}
