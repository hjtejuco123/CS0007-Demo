/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TN28_Module8;

//throws
public class Sample4 {
    static void checkFile() throws Exception {
        throw new Exception ("File not found");
}
    public static void main(String[] args) {
        try {
            checkFile();
        }catch(Exception e){
            System.out.println("Exception caught "+e.getMessage() );
        }
    }
    
}
