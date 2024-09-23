/**
 * Methods with parameters
 * @author hadjitejuco
 * addition of two numbers int a and b
 */
public class Module5_ex2v2 {
    //method add
    public static int add(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        //call the method pass the parameter
        int result = add(10, 20);
        System.out.println("Sum is "+result);
        
    }
    
}

