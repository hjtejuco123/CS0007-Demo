
public class Main_M7_TN28_3 {
    public static void main(String[] args) {
        M7_TN28_3 account1 = new M7_TN28_3("Hadji",500);
        account1.displayAccountInfo();
        account1.deposit(200);
        account1.displayAccountInfo();
        account1.deposit(500, "From Salary");
        account1.displayAccountInfo();
        account1.withdraw(700);
        account1.displayAccountInfo();
        System.out.println();
        M7_TN28_3b account2 = new M7_TN28_3b("Joan",2000,5);
        account2.displayAccountInfo();
        account2.deposit(600);
        account2.displayAccountInfo();
        account2.deposit(500, "From Savings");
        account2.displayAccountInfo();
        account2.addInterest();
        account2.displayAccountInfo();
        account2.withdraw(1000);
        account2.displayAccountInfo();
        
        
    }
}
