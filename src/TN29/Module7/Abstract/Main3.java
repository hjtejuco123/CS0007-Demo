
package TN29.Module7.Abstract;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueMenu = true;
        
        while(continueMenu){
            System.out.println("Choose an animal:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Cow");
            System.out.println("4. Exit");
            System.out.print("Select Animal: ");
            int choice = scanner.nextInt();
            Animal3 animal3 = null;
            
            switch(choice){
                case 1:
                    animal3 = new Dog3();
                    break;
                case 2:
                    animal3 = new Cat3();
                    break;
                case 3:
                    animal3 = new Cow3();
                    break;
                case 4:
                    continueMenu = false;
                    continue;
                            
                default:
                    System.out.println("Invalid choice");
            
            }
            if (animal3 != null) {
                animal3.makeSound();
                animal3.sleep();
            }
            
            System.out.println("Try again (yes/no)");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("yes")) {
                continueMenu=false;
            }
        }
    }
}
