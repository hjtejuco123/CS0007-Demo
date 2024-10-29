
//create abstract class for ATM

package TN28.Module7.ATM;

abstract class ATM {
    protected double balance;
    
    //constructor
    public ATM (double initialBalance) {
        this.balance = initialBalance;
    }
    
    public abstract void checkBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
