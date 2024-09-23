/**
 * Procedural Programming
 * 
 * @author hadjitejuco
 */

public class M5_TN281 {
    //procedure - static
//    public static void hello(){
//        System.out.println("Hello World");
//    }
//    public static void helloAgain(){
//        System.out.println("Hello Again");
//    }
    public void hello(){
        System.out.println("Hello World");
    }
    public void helloAgain(){
        System.out.println("Hello Again");
    }
    
    public static void main(String[] args) {
        //create object
        M5_TN281 obj1 = new M5_TN281();
        M5_TN281 obj2 = new M5_TN281();
        obj1.hello();
        obj1.helloAgain();
        obj2.hello();
        obj2.helloAgain();
        
        
//        hello();
//        helloAgain();
    }
    
}
