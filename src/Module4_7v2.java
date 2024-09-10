/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_7v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns :");
        int columns = scanner.nextInt();
        //array with specific size 
        int[][] matrix = new int[rows][columns];
        
        //input
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                          //  i  j 
                //Element at [0][0]: 1
                System.out.print("Element at ["+i+"]["+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        //output
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                        // 1 2 3
                        // 4 5 6
                    System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
