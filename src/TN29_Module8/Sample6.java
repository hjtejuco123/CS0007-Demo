
package TN29_Module8;

import java.util.Scanner;
public class Sample6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Etner a no. between  0 and 20");
        int value = scanner.nextInt();
        assert (value >= 0 && value <=20);
        System.out.println("Value is "+value);
          
        
        
    }
    
}
