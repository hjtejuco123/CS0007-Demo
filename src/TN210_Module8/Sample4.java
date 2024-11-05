
package TN210_Module8;

public class Sample4 {
      public static void main(String[] args) {
        try {
            
            String str = null;
            System.out.println("Length is "+str.length());
            
            //ArrayIndexOutOfBoundsException
            int[] numbers = {1,2,3};
            System.out.println("Access element 1 "+numbers[0]);
            
            
            int numerator = 10;
            int denominator = 2;
            int result = numerator / denominator;
            System.out.println("Result is "+result);
            
          
            
            
        }catch(ArithmeticException e){
           // System.out.println("Exception caught "+e);
            System.out.println("Exception caught: Modulo by zero is not allowed.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Access denied Array index out of bounds.");
        }catch(NullPointerException e){
            System.out.println("Attempted to access null object.");
        }finally{
            System.out.println("Code Complete");
        }
        
        
        
        
    }
}
