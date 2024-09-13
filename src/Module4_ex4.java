/**
 * for, while, do while
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for loop
        System.out.println("hadji");
        System.out.println("Printing numbers from 1-10");
            // 1          2 - t   4
        for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");  //3
        }
        
        System.out.println();
        System.out.println("Printing numbers from 10-1");
        for (int j=10; j>=1; j--) {
            System.out.print(j + " ");  //3
        }
        System.out.println();
        /*
        i       i<=10         sout      i++
        1       t             1         2
        2       t             2         3
        3       t             3         4
        4       t             4         5
        5       t             5         6
        6       t             6         7
        7       t             7         8
        8       t             8         9
        9       t             9         10
        10      t             10        11 
        11      f
        */
//        System.out.println();
//        System.out.println("While Loop");
//        System.out.print("Enter n: ");
//        int n = scanner.nextInt();
//        int sum=0;
//        int i = 1;
//        System.out.println("sum of "+n+" numbers: ");
//        while (i<=n) {
//            sum += i;   // sum = sum+i; accumulator
//            i++;
//        }
//        System.out.println("sum is "+sum);
//        System.out.println();
//        System.out.println("Do While Loop");
//        System.out.println("Factorial ");
//        //1*2*3*4
//        System.out.print("Enter n: ");
//        int num = scanner.nextInt();
//        int j = 1;
//        int factorial = 1;
//        do {
//            factorial *= j; 
//            j++;
//        }while (j<=num);
//        System.out.println("Factorial value is "+factorial);
        
    }
}
