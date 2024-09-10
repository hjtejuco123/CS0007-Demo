
/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex5v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        //ask for use the size of the array
        System.out.print("Enter the size of the array ");
        n = scanner.nextInt();
        
        //declare array base from the input n
        int[] numbers = new int[n];
        //input number to our array
        System.out.print("Enter "+numbers.length+" numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Display the number:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print (numbers[i] +" ");
        }
        System.out.println();
    }
}
