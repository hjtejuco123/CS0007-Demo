
package TN29.Module7.Abstract;

import java.util.Scanner;
public class Main4 {
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
            Animal4 animal4 = null;
            
            switch(choice){
                case 1:
                    animal4 = new Dog4();
                    break;
                case 2:
                    animal4 = new Cat4();
                    break;
                case 3:
                    animal4 = new Cow4();
                    break;
                case 4:
                    continueMenu = false;
                    continue;
                            
                default:
                    System.out.println("Invalid choice");
            
            }
            if (animal4 != null) {
                animal4.makeSound();
                animal4.sleep();
            }
            
            System.out.println("Try again (yes/no)");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("yes")) {
                continueMenu=false;
            }
        }
    }
}
