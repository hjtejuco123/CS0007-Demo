/**
 * Method Overloading 
 * use the same method name with different parameters
 * @author hadjitejuco
 */
public class Module5_ex5 {
    //method with 2 parameters
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    
    //method with 3 parameters
    public static void main(String[] args) {
        
        Module5_ex5 mathOps = new Module5_ex5();
        //call method with 2 parameters
        System.out.println("Sum of 2 numbers: "+mathOps.add(10, 20));
        //call method with 3 parameters
        System.out.println("Sum of 3 numbers: "+mathOps.add(20, 30, 40));
        
        
    }
    
    
}
