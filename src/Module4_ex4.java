/**
 * for, while, do while
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Module4_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for loop
        System.out.println("Printing numbers from 1-10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("While Loop");
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        System.out.println("sum of "+n+" numbers: ");
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("sum is "+sum);
        System.out.println();
        System.out.println("Do While Loop");
        System.out.println("Factorial ");
        System.out.print("Enter n: ");
        int num = scanner.nextInt();
        int j = 10;
        int factorial = 1;
        do {
            factorial *= j; 
            j++;
        }while (j<=num);
        System.out.println("Factorial value is "+factorial);
        
    }
}
