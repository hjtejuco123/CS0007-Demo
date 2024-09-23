/**
 * Find the max element in an array
 * @author hadjitejuco
 */

import java.util.Scanner;
public class Module5_ex7 {
    
    public static int findMax(int[] numbers){
        int max = numbers[0];
        for (int num : numbers ) {
            if (num>max){
                max = num;
            }
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt
        System.out.println("Enter number of array elements: ");
        int size = scanner.nextInt();
        //declare array and pass size
        int[] numbers = new int[size];
        System.out.println("Enter "+size+ " numbers: ");
        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int max = findMax(numbers);
        System.out.println("The max element in the array is: "+max);
        scanner.close();
    }
}
