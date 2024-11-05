

package TN29_Module8;

public class Sample4 {
    
    public static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Age must be atleast 18");
        }else{
            System.out.println("ready to vote ");
        }
    
    }

    public static void main(String[] args) {
        try{
            checkAge(15);
            
        }catch(Exception e){
            System.out.println("Exception caught "+e);
            System.out.println("Exception caught "+e.getMessage());
        
        }
    }
    
}
