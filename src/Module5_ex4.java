/**
 * Multiple Parameters
 * Compute for the area of rectangle
 * length * width
 * @author hadjitejuco
 */
public class Module5_ex4 {
    
    public double calculateArea(double length, double width){
        return length * width;
    }
    
    public static void main(String[] args) {
        //create object
        Module5_ex4 calcArea = new Module5_ex4();
        
        double area = calcArea.calculateArea(5.0, 3.5);
        System.out.println("Area of Rectangle is: "+area);
    }
}
