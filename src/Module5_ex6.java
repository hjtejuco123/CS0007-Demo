/**
 * Arrays with methods
 * @author hadjitejuco
 * Enter number of elements 
 * Compute for the sum of the array
 */
import java.util.Scanner;
public class Module5_ex6 {
    //function
    public static int calculateSum(int[] numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int size = scanner.nextInt();
        //declare the array
        int[] numbers = new int [size];
        //input array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        //calculation
        int sum = calculateSum(numbers);
        System.out.println("The sum of the array is "+sum);
        scanner.close();
        
    }
    
}
