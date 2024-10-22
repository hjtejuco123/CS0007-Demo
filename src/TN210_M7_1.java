
//Method overloading
//Calculator - Sum - addition
//why use method overloading
//1 improve code readability and code clarity, consistent
//2 code reusability
//3 increase flexibility 

public class TN210_M7_1 {
    //method with parameters to compute for the sum of two
    //integer values
    public int add(int a, int b) {
        return a + b;
    }
    public double add (double a, double b){
        return a+b;
    }
    public int add (int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        TN210_M7_1 calc = new TN210_M7_1();
        
        System.out.println("Sum of 5 and 6 = "+calc.add(5, 6));
        System.out.println("Sum of 5.5 and 6.6 = "+calc.add(5.5, 6.6));
        System.out.println("Sum of 1 2 3 = "+calc.add(1, 2, 3));

    }
}
