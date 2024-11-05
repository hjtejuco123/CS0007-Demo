/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

public class Sample5 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
//        try {
//            int a = 0;
//            int b = 10/a;
//            System.out.println("Access index 3 "+numbers[4]);
//        }catch(ArithmeticException e){
//            System.out.println("Division by 0 "+e);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Index out of bounce "+e);
//        }
//        System.out.println("After try/Catch block");
            try {
                System.out.println("Access index 3 "+numbers[4]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bounce "+e);
                System.out.println("Index out of bounce "+e.getMessage());
            }
        
        


        
        
    }
}
