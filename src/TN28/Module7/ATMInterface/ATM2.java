
package TN28.Module7.ATMInterface;

abstract class ATM2 implements ATMOperations{
    protected double balance;
    
    //constructor
    public ATM2 (double initialBalance) {
        this.balance = initialBalance;
    }
}
