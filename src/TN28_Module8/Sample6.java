/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

public class Sample6 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int value = array[-1];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e);
            System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());

        }
        
    }
}
