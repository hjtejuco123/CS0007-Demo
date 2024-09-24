/**
 * Method overloading
 * @author hadjitejuco
 */
public class M5_TN296 {
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add (double a, double b){
        return a+b;
    }
    public int add (int[] numbers){
        int sum = 0;
        for (int num :numbers){
            sum += num;
        }
        return sum;
    }
}
