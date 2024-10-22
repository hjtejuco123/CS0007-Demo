//Method Overloading with arrays

import java.util.Scanner;
public class TN29_M7_4 {
    //method to compute the sum of integer arrays
    public int sum(int[] numbers){
        int total = 0;
        for (int num: numbers){
            total += num;
        }
        return total;
    }
    //double type
    public double sum(double[] numbers){
        double total = 0.0;
        for (double num: numbers){
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        TN29_M7_4 arraySum = new TN29_M7_4();
     
        System.out.print("Enter number of integers: ");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        System.out.print("Enter integers ");
        for (int i = 0; i < n; i++) {
            intArray[i]=scanner.nextInt();
        }
        System.out.println("Sum of Int "+arraySum.sum(intArray));
        
        System.out.print("Enter number of double values: ");
        int m = scanner.nextInt();
        double[] doubleArray = new double[m];
        System.out.print("Enter double values ");
        for (int i = 0; i < m; i++) {
            doubleArray[i]=scanner.nextDouble();
        }
        System.out.println("Sum of double values "+arraySum.sum(doubleArray));
        
    }
    
}
