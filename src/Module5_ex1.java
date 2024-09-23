/**
 * Basic Method Declaration and usage
 * @author hadjitejuco
 * prints out hello world
 */
public class Module5_ex1 {
    //create a method name sayHello()
    //display hello world -> void, public
    
    //static - method belongs to the class (not as an object)
//    public static void sayHello(){
//        System.out.println("Hello World");
//    }
    
    //object base
    public void sayHello(){
        System.out.println("Hello World");
    }
    
    //static
//    public static void sayILoveJava(){
//        System.out.println("I love coding in Java.");
//    }
    
    //object
    public void sayILoveJava(){
        System.out.println("I love coding in Java.");
    }
    
    public static void main(String[] args) {
        //call the function direct (static)
        //sayHello();
        //sayILoveJava();
        
        //create object of the Module5_ex1

        Module5_ex1 obj = new Module5_ex1();
        Module5_ex1 obj2 = new Module5_ex1();
        
        //call the method
        obj.sayHello();
        obj.sayILoveJava();
        
        obj2.sayHello();
        obj2.sayILoveJava();
        
    }
    
    
    
}
