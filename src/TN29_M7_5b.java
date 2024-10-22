//subclass
//interest rate, withdraw 

public class TN29_M7_5b extends TN29_M7_5  {
    double interestRate;
    
    //Constructor 
    TN29_M7_5b(String accountHolderName, double initbalance, double interestRate ){
        super(accountHolderName,initbalance);
        this.interestRate = interestRate;
        
    }
    
    @Override
    void withdraw(double amount){
        if (amount > 1000){
            System.out.println("Withdraw limit exceeded");
        }else{
            super.withdraw(amount);
        }
  
    }
  
    void addInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Rate "+interest);
    }
    
}
