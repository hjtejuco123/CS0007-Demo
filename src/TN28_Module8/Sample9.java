/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;
import java.util.Scanner;
public class Sample9 {
//    public static void main(String[] args) {
//        int age = 0;
//        assert(age>0): "Age should be atleast 1";
//        if (age>=18) {
//            System.out.println("Congrats You're an adult!");
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number between 0 to 20");
        int value = scanner.nextInt();
        assert(value >=0 && value <= 20):" Invalid value "+value;
        System.out.println("You entered "+value);
    }
    
    
    
    
}
