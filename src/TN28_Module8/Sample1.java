/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

public class Sample1 {
    public static void main(String[] args) {
        try {
            int d = 2;
            int a = 10/d;
            System.out.println("result "+a); 
        }catch(ArithmeticException e){
            System.out.println("Exception Caught: Division by 0 not allowed");
        }
       
    }
 
}
