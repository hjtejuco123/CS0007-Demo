/**
 * Array
 *  Store + Print
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create array
        int[] numbers = new int[5];
        //prompt
        System.out.print("Enter 5 integers: ");
        //method - length
        //input array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        //print array
        System.out.println("Printing value of the array ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        scanner.close();
    }
}
