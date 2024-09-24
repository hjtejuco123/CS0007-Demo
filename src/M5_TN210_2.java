/**
 * Declaration using Objects
 * @author hadjitejuco
 */
public class M5_TN210_2 {
    
    //method with no return value no parameters
    //void 
    public void hello(){
        System.out.println("Hello World from OOP");
    }
    
    
    public static void main(String[] args) {
        //create an object from the class
        M5_TN210_2 obj = new M5_TN210_2();
        M5_TN210_2 obj2 = new M5_TN210_2();
        //call the method 
        obj.hello();
        obj2.hello();
    }
    
}
