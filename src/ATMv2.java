/**
 * ATMv2
 * @author hadjitejuco
 */
import java.util.Scanner;
public class ATMv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] userNames = new String[10];
        double[] balances = new double[10];
        
        double depositAmount=0;
        double withdrawAmount=0;
        
        int userCount = 0; //tracker of the number of users
    
        /*
        while (true){
            press ng exit (true)
            press exit (6) -> return 
        
        }
        */
        
        
        while(true){
            System.out.println("HJT ATM System");
            System.out.println("1. Add a new user");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Summary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (userCount<10) {
                        //input
                        System.out.print("Enter your name: ");
                        userNames[userCount]=scanner.next();
                        System.out.print("Enter initial Deposit ");
                        balances[userCount] = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Account created for: "+userNames[userCount]);
                        System.out.println("Initial Balance is "+balances[userCount]);
                        userCount++;//increment
                    }else{
                        System.out.println("User Limit reached....");
                    }
                    break;
                case 2:
                    System.out.print("Enter account name to check: ");
                    String nameToCheck = scanner.next();
                    boolean userFound = false;
                    
                    for (int i = 0; i < userCount; i++) {
                        //equalsToIgnoreCase
                        if (userNames[i].equalsIgnoreCase(nameToCheck)) {
                            System.out.println("Balance is "+balances[i]);
                            userFound = true;
                            break;
                        }
                    }
                    
                    if (!userFound){
                        System.out.println("User not found....");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter your name to deposit: ");
                    String nameToDeposit = scanner.next();
                    userFound = false;
                    for (int i = 0; i < userCount; i++) {
                        if (userNames[i].equalsIgnoreCase(nameToDeposit)) {
                            System.out.println("Enter amount to deposit: ");
                            depositAmount = scanner.nextDouble();
                        }
                        
                        if (depositAmount > 0){
                            balances[i]+= depositAmount;
                            System.out.println("Deposit amount: "+depositAmount);
                            System.out.println("New balance is: "+balances[i]);
                        }else{
                            System.out.println("Invalid deposit ");
                        }
                        userFound = true;
                        break;
                    }
                    if (!userFound){
                        System.out.println("User not found....");
                    }
                    
                    break;
                case 4:
                    System.out.print("Enter your name to withdraw: ");
                    String nameToWithdraw = scanner.next();
                    userFound = false;
                    for (int i = 0; i < userCount; i++) {
                        if (userNames[i].equalsIgnoreCase(nameToWithdraw)) {
                            System.out.println("Enter amount to withdraw: ");
                            withdrawAmount = scanner.nextDouble();
                        }
                        
                        if (withdrawAmount > 0 && withdrawAmount <= balances[i]){
                            balances[i]-= withdrawAmount;
                            System.out.println("Withdraw amount: "+withdrawAmount);
                            System.out.println("New balance is: "+balances[i]);
                        }else if (withdrawAmount > balances[i]){
                            System.out.println("Insufficent amount to withdraw ");
                        }else {
                            System.out.println("Invalid deposit ");
                        }
                        userFound = true;
                        break;
                    }
                    if (!userFound){
                        System.out.println("User not found....");
                    }
                    break;
                case 5:
                    if (userCount > 0){
                        System.out.println("Account Summary ");
                        for (int i = 0; i < userCount; i++) {
                            System.out.println("User: "+userNames[i]+ "| Balance "+balances[i]);
                        }
                    
                    }else{
                        System.out.println("No Records found ");
                    
                    }
                    break;
                case 6:
                    System.out.println("Thank you..Bye...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice: ");
            }
            
        }

    }
}
