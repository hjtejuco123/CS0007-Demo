/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

public class Sample2 {
    //static method 
    static void subroutine(){
        try {
            int d = 0;
            int a = 10/d;
            System.out.println("result "+a);
        }catch(ArithmeticException e){
            System.out.println("Division by zero not allowed");
        }
    
    }
    
    public static void main(String[] args) {
        Sample2.subroutine();
    }
}
