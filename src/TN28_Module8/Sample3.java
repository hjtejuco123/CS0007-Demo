/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//throw keyword 

package TN28_Module8;

public class Sample3 {
    //static method
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Age must be at least 18");
        }else {
            System.out.println("Access granted");
        }
    
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        }catch(Exception e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
    
    
}
