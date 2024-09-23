/**
 * Hello World 
 *      OOP / Procedure
 * @author hadjitejuco
 */
public class Module5v2_ex1 {
    //procedure
    public static void sayHello(){
        System.out.println("Hello world");
    }
    public static void sayILoveJava(){
        System.out.println("I love java programming");
    }
    
    //OOP
    public void Hello(){
        System.out.println("Hello World 2");
    
    }
    
    
    public static void main(String[] args) {
        
        Module5v2_ex1 obj1 = new Module5v2_ex1();
        Module5v2_ex1 obj2 = new Module5v2_ex1();
        obj1.Hello();
        obj2.Hello();
        
        
        //procedure call
        sayHello();
        sayILoveJava();
    }
    
    
}
