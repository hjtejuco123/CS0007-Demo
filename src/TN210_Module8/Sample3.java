/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN210_Module8;

import java.util.Scanner;
public class Sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Enter numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Enter denominator: ");
                int denominator = scanner.nextInt();
                int result = numerator/denominator;
                System.out.println("result "+result);
            }catch(ArithmeticException e){
                System.out.println("Exception caught: Division by zero is not allowed.");
            
            }
            
        }
        scanner.close();
        
    }
}
