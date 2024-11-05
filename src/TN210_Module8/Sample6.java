
package TN210_Module8;


public class Sample6 {
    public static void main(String[] args) {
        int age = 18;
        assert(age>0): "The age should be atleast 1";
//        if (age > 0){
//            System.out.println("Age "+age);
//        }else{
//            System.out.println("Should be atleast 1");
//        }
        if (age >= 18){
            System.out.println("Your an adult");
        }
            
    }
}
