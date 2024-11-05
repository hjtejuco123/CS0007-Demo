
package TN29_Module8;

public class Sample1 {
    public static void main(String[] args) {
       try{
            int d = 0;
            int a = 10 / d;
            System.out.println("Output is "+a);
       }catch(ArithmeticException e){
           System.out.println("Exception caught: division by zero is not allowed");
           //System.out.println("Exception Caught "+e);
       }
    }

    
}
