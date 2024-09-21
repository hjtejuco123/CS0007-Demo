
/**
 * Basic Method Declaration and usage
 * @author hadjitejuco
 * prints out hello world
 */
public class Module5_ex1 {
    //create a method name sayHello()
    //display hello world -> void, public
    public void sayHello(){
        System.out.println("Hello World");
    }
    
    public void sayILoveJava(){
        System.out.println("I love coding in Java.");
    }
    
    public static void main(String[] args) {
        //create object of the Module5_ex1
        Module5_ex1 obj = new Module5_ex1();
        
        //call the method
        obj.sayHello(); //expected output - Hello World
        obj.sayILoveJava();
    }
    
    
    
}
