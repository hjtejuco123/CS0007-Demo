
public class TN29_M7_5_Main {
    public static void main(String[] args) {
        //parent 
        TN29_M7_5 account1 = new TN29_M7_5("Hadji",500);
        account1.displayInformation();
        account1.deposit(200);
        account1.displayInformation();
        account1.deposit(150,"Salary Savings");
        account1.displayInformation();
        account1.withdraw(300);
        account1.displayInformation();
        
        //subclass 
        TN29_M7_5b account2 = new TN29_M7_5b("Hadji",2000,5);
        account2.displayInformation();
        account2.deposit(500, "From Savings");
        account2.addInterest();
        account2.displayInformation();
        account2.withdraw(1200);
        account2.withdraw(500);
        account2.displayInformation();
        
    }
}
