
//Method overloading with Arrays

import java.util.Scanner;
public class TN210_M7_4 {
    //methods
    public int sum(int[] numbers){
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        return total;
    }

    public double sum(double[] numbers){
        double total = 0.0;
        for (double num : numbers){
            total += num;
        }
        return total;
    
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       TN210_M7_4 arraySum = new TN210_M7_4();
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        System.out.print("Enter integers: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Sum is "+arraySum.sum(intArray));
        System.out.println();
        
        System.out.print("Enter an integer: ");
        int m = scanner.nextInt();
        double[] doubleArray = new double[m];
        System.out.print("Enter double values: ");
        for (int i = 0; i < m; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        System.out.println("Sum is "+arraySum.sum(doubleArray));
        
    }
}
