/**
 *
 * @author hadjitejuco
 */
public class Main_M5TN296 {
    public static void main(String[] args) {
        M5_TN296 calculator = new M5_TN296();
        
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(10, 20, 30);
        double sum3 = calculator.add(1.1, 2.1);
        int sum4 = calculator.add(new int[]{1,2,3,4,56});
        
        System.out.println("Sum of two int "+sum1);
        System.out.println("Sum of three int "+sum2);
        System.out.println("Sum of double "+sum3);
        System.out.println("Sum of array "+sum4);
                
       
    }
}
