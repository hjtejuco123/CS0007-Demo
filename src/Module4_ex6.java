/**
 * Compute the price of 3 products
 * @author hadjitejuco
 */

import java.util.Scanner;
public class Module4_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[3];
        
        //prompt + input
        System.out.println("Enter prices of 3 products: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scanner.nextDouble();
            //prices[0]=1
            //prices[1]=2
            //prices[2]=3
        }
        
        //calculation
        double total=0; //accumulator
        for (int i = 0; i < prices.length; i++) {
            total += prices[i]; //numbers[0]-1, 1-2, 2-3
        }
        System.out.println("Total price is: "+total);
        scanner.close();
    }
}
