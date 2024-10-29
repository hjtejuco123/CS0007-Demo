/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28.Module7.ATMInterface;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        SimpleATM2 myATM = new SimpleATM2(1000.00); //initial na balance
        String[] transactions = new String[10];
        int transactionCount = 0;
        
        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Transaction");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    myATM.checkBalance();
                    transactions[transactionCount++] = "Checked Balance";
                    break;
                case 2:
                    System.out.println("Enter deposit amount");
                    double depositAmount = scanner.nextDouble();
                    myATM.deposit(depositAmount);
                    transactions[transactionCount++] = "Deposited "+depositAmount;
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = scanner.nextDouble();
                    myATM.withdraw(withdrawAmount);
                    transactions[transactionCount++] = "Withdrew "+withdrawAmount;
                    break;
                case 4:
                    System.out.println("System Transactions ");
                    for (int i=0; i< transactionCount; i++){
                        System.out.println((i+1)+"."+transactions[i]);
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            
            
            
            }
            if (transactionCount >= transactions.length){
                System.out.println("Transaction log is full ");
                scanner.close();
                return;
            }        
        }

    }
}
