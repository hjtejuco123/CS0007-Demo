
package TN210_Module8;
    
public class BankAccount {
    private double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    //method withdraw
    public void withdraw (double amount)throws InsufficeintBalanceException{
        if (amount > balance) {
            throw new InsufficeintBalanceException("Insufficient Balance...");
        }else{
            balance -= amount;
            System.out.println("Withdraw successul: balance is "+balance);
        }
    
    }

}
