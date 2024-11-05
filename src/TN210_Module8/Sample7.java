
package TN210_Module8;

import java.util.Scanner;
public class Sample7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers from 0 to 20 ");
        int value = scanner.nextInt();
        assert (value >= 0 && value <= 20) : "Invalid "+value;
        
//        if (value >= 0 && value <= 20){
//            System.out.println("Valid - You entered "+value);
//        }else {
//            System.out.println("Invalid");
//        }


        System.out.println("Valid - You entered "+value);
    }
}
