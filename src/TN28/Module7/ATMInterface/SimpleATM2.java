
package TN28.Module7.ATMInterface;

public class SimpleATM2 extends ATM2{
    
    public SimpleATM2(double initialBalance){
        super(initialBalance);
    }
   
    @Override
    public void checkBalance(){
        System.out.println("Current Balance "+balance);
    }
    
    @Override
    public void deposit(double amount){
        //amount > 0 - balance += amount
        
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: "+amount);
        }else{
            System.out.println("Invalid deposit amount...");
        }
    }
    
    @Override
    public void withdraw(double amount){
        //check amount > 0 && amount <= balance 
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Invalid withdrawal amount ");
        }
        
        
    }
}
