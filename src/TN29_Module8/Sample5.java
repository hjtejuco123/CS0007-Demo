
package TN29_Module8;

//assertion
public class Sample5 {
    public static void main(String[] args) {
        int age  = 1;
//        if (age < 0) {
//            System.out.println("Age should be positive");
//        }
        assert(age>0): "Age should be positive";
        System.out.println("age is "+age);
        
//        if (age >=18){
//            System.out.println("Your an adult ");
//        }
    }
    
    
    
}
