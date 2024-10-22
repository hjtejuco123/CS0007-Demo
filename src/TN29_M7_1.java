//Polymorphism
//method overloading
//same method name parameters and return type
//simple calculator to get the sum 
public class TN29_M7_1 {
    public int add(int a, int b){
        return a+b;
    }
    public double add (double a, double b){
        return a+b;
    }
    public int add (int a, int b, int c){
        return a+b+c;
    }
          
    public static void main(String[] args) {
        TN29_M7_1 calc = new TN29_M7_1();
        System.out.println("Sum of 10 and 10 "+calc.add(10, 10));
        System.out.println("Sum of 10.5 and 10.8 "+calc.add(10.5, 10.8));
        System.out.println("Sum of 10 20 30 "+calc.add(10, 20, 30));
    }
    
}
