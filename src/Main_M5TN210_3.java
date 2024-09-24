
/**
 *
 * @author hadjitejuco
 */
public class Main_M5TN210_3 {
    public static void main(String[] args) {
        
        M5_TN210_3 obj1 = new M5_TN210_3();
        obj1.iLoveJava();
        int result = obj1.add(10, 30);
        System.out.println("Result is "+result);
        double celcius = obj1.toCelcius(98.6);
        System.out.println("Temp is "+celcius);
        double area = obj1.calculateArea(5.0, 2.8);
        System.out.println("Area is "+area);
        
    }
}
