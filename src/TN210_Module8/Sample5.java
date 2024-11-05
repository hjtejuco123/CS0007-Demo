//library management system
//1. Calculate late fees
//2. Access Book Title by index
//3. Length of a book title

package TN210_Module8;

import java.util.Scanner;
public class Sample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = {"Java Programming", "Python", "Algorithm", null};

        while(true){
            System.out.println("Library Management System");
            System.out.println("1. Calculate Late fees.");
            System.out.println("2. Access Book title by index.");
            System.out.println("3. Get the length of the title of the book");
            System.out.println("4. Exit");
            System.out.print("Enter choice 1-4 ");
            int choice = scanner.nextInt();
        
            switch(choice){
                case 1:
                    try {
                        System.out.print("Enter the number of days overdue: ");
                        int daysOverdue = scanner.nextInt();
                        int feePerDay = 5;
                        int totalFee = feePerDay / daysOverdue;
                        System.out.println("Total fee is: "+totalFee);
                    
                    }catch(ArithmeticException e) {
                        System.out.println("Exception caught: days overdue cannot be zero");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter the book index (0-3)  ");
                        int index = scanner.nextInt();
                        System.out.println("Book title "+index+": "+books[index]);
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Exception caught - Book index out  of bounds ");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter the book index to get the title length 0-3");
                        int index = scanner.nextInt();  
                        System.out.println("Length of book is "+books[index].length());
                    
                    }catch(NullPointerException e){
                        System.out.println("Exception caught: Book title is null");

                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Exception caught - Book index out  of bounds ");
                    }
                    break;
                case 4:
                    System.out.println("Exit the application ");
                    scanner.close();
                    return;
                default:
                     System.out.println("Invalid option");
                     break;
            }
        
        }

        
    }
    
}
