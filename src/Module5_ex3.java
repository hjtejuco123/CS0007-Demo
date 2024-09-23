/**
 * Methods with Return value and parameter
 * @author hadjitejuco
 * compute for the temp
 */
public class Module5_ex3 {
    //methods
    public double toCelcius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }
    public static void main(String[] args) {
        //create object
        Module5_ex3 tempConverter = new Module5_ex3 ();
        
        double celcius = tempConverter.toCelcius(98.6);
        System.out.println("Temp in Celsius: "+celcius);
    }
}
