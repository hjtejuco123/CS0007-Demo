
//method overloading
//Method overriding
//Bank system (deposit, withdraw)

//Parent Class
//Bank Account
public class TN29_M7_5 {
    String accountHolderName;
    double balance;
    
    TN29_M7_5(String accountHolderName, double initbalance){
        this.accountHolderName = accountHolderName;
        this.balance = initbalance;
    }
    
    //display information
    public void displayInformation(){
        System.out.println("Account Holder "+accountHolderName);
        System.out.println("Balance "+balance);
        System.out.println("-----------------");
    }
    //method overloading
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited "+amount);
        System.out.println("-----------------");
    }
    void deposit(double amount, String note){
    
        balance += amount;
        System.out.println("Deposited "+amount);
        System.out.println("Note: "+note);
        System.out.println("-----------------");
        
    }
    
    void withdraw (double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Insufficeint balance ");
        }
   
    }
   
}
