/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN29_Module8;



import java.util.Scanner;
public class Sample7 {
    private double balance;
    
    //Constructor
    public Sample7(){
        balance = 0.0;
    }
    
    //deposit method 
    //amount is less than 0
    //add balance
    public void deposit(double amount){
        if (amount <=0){
            System.out.println("Amount must be greater than zero");
        }else{
            balance += amount;
            System.out.println("Deposited: "+amount);
        }
    }
        //withdraw method
        
        //IllegalArgumentException
    public void withdraw(double amount){
        try{
                if (amount>balance) {
                    throw new IllegalArgumentException("Insufficient Balance");
                }else if (amount <=0){
                    System.out.println("Amount must be greater than zero");
                }else{
                   balance -= amount;
                    System.out.println("Withdrawn "+amount);
                }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void viewBalance(){
    
        System.out.println("Current Balance is "+balance);
    }

    public static void main(String[] args) {
        
        Sample7 account = new Sample7();
        Scanner scanner = new Scanner(System.in);
        int choice;
      
        while(true){
            System.out.println("MENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    System.out.println("Exit Program");
                    return;
                default:
                    System.out.println("Invalid option");
            
            }
        
        }
        
    }
}
