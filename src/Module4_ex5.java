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
        int[] numbers = new int[5];  //5-1 (start 0)
        //prompt
        System.out.print("Enter 5 integers: ");
        //method - length
        //input array.
        //int length = sizeof(arr) / sizeof(arr[0]);
        //       1             2            //4
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();  //3
    /*
        i       i<numbers.length    input           i++
        0       t                   numbers[0]=1     1
        1       t                   numbers[1]=2     2
        2       t                   numbers[2]=3     3
        3       t                   numbers[3]=4     4
        4       t                   numbers[4]=5     5
        5       f    
    */
            //numbers[0]=1
            //numbers[1]=2
            //numbers[2]=3
            //numbers[3]=4
            //numbers[4]=5
        }
        //regular java code without .length
//        for (int i = 0; i < 5; i++) {
//            numbers[i]=scanner.nextInt();
//        }
        
        
        //print array
        System.out.println("Printing value of the array ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        /*
            i       i<numbers.length    output      i++
            0       t                   1           1
            1       t                   2           2
            2       t                   3           3
            3       t                   4           4
            4       t                   5           5
            5       f           
        */
            //numbers[0]=1
            //numbers[1]=2
            //numbers[2]=3
            //numbers[3]=4
            //numbers[4]=5
        }
        System.out.println();
        scanner.close(); //memory leak
    }
}
