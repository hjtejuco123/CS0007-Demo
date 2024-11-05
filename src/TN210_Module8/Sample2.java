
package TN210_Module8;

public class Sample2 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 2;
            //int result = numerator / denominator;
            //System.out.println("Result is "+result);
            int remainder = numerator % denominator;
            System.out.println("Result is "+remainder);
        
        }catch(ArithmeticException e){
           // System.out.println("Exception caught "+e);
            System.out.println("Exception caught: Modulo by zero is not allowed.");
        }
        
        
        
        
    }
}
