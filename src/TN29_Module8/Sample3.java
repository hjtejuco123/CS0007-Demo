
//ArithmeticException
//ArrayIndexOutOfBoundsException
//NullPinterException
package TN29_Module8;

public class Sample3 {
    public static void main(String[] args) {
        try {
            
             //NullPointerException
            String str = null;
            System.out.println("Length "+str.length());
            
            //ArrayIndexOutOfVoundsException
            int[] numbers = {1,2,3};
            System.out.println("Access index 5 "+numbers[5]);
            
            //arithmeticException -> Division by Zero
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result "+result);
        
         
        
        }catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by Zero not allowed.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds.");
        }catch(NullPointerException e){
            System.out.println("NullPointerException: Attempted to access a null object.");
        }finally {
            System.out.println("Execution of the finally block.");
        }
        
        
    }
    
    
    
    
}
