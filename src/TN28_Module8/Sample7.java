/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

public class Sample7 {
   static void checkString(String str) {
       if (str==null) {
           throw new NullPointerException("String cannot be null");
       }
   }
    public static void main(String[] args) {
        try {
            checkString(null);
        }catch(NullPointerException e){
            System.out.println("Exception Caught "+e);
            System.out.println("Exception Caught "+e.getMessage());

        }
    }
   
   
}
