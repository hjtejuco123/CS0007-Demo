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
        //input array.
        //int length = sizeof(arr) / sizeof(arr[0]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
            //numbers[0]=1
            //numbers[1]=2
            //numbers[2]=3
            //numbers[3]=4
            //numbers[4]=5
            
        }
        //print array
        System.out.println("Printing value of the array ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
            //numbers[0]=1
            //numbers[1]=2
            //numbers[2]=3
            //numbers[3]=4
            //numbers[4]=5
        }
        System.out.println();
        scanner.close();
    }
}
