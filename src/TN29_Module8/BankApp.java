package TN29_Module8;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        try{
            account.withdraw(600);
        }catch(InsufficientBalanceException e){            
            System.out.println("Excepttion caught "+e.getMessage());
        }
        
        
    }

}
