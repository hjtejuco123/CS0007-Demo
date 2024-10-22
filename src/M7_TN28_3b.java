
//subclass

public class M7_TN28_3b extends M7_TN28_3 {
    double interestRate;
    
    //constructor
    public M7_TN28_3b(String accountHolderName, double initbalance, double interestRate){
        super(accountHolderName,initbalance);
        this.interestRate = interestRate;
    }
    
    @Override
    public void withdraw(double amount){
        //check if the accouunt is > 1000
        if (amount > 1000){
            System.out.println("Withdrawal Limit exceeded");
        }else{
            super.withdraw(amount);
        }
    
    }
    
    public void addInterest(){
        double  interest = balance + interestRate / 100;
        balance += interest;
        System.out.println("Interest added "+interest);
    }
    
}
