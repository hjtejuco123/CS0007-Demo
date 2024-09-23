/**
 *
 * @author hadjitejuco
 */
public class MainCalc {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(10, 20, 30);
        double sum3 = calculator.add(10.2, 22.5);
        int sum4 = calculator.add(new int[]{1,2,3,4});
        
        System.out.println("Sum of two numbers "+sum1);
        System.out.println("Sum of three numbers "+sum2);
        System.out.println("Sum of double numbers "+sum3);
        System.out.println("Sum of array "+sum4);
    }
}
