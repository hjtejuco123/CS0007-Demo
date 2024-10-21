//performs summation of different parameters

public class TN28_Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double add (double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        TN28_Calculator calc = new TN28_Calculator();
        System.out.println("Sum of 1 and 2 is "+calc.add(1,2));
        
        System.out.println("Sum of 10.5 and 20.5 is "+calc.add(10.5,20.5));
        
        System.out.println("Sum of 4 5 6 is "+calc.add(4,5,6));
        
    }
    
}
