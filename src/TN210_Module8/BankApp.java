package TN210_Module8;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        
        try {
            account.withdraw(600);
                    
        }catch(InsufficeintBalanceException e){
            System.out.println("Exception caught "+e.getMessage());
        
        }
    }
}
