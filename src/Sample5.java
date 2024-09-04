/**
 * Module 3
 * Relational and Logical Operators
 * <, >, ==, != true or false 
 * 
 *                          and                 or          not
 *                          fand                tor
 * t    t   t and t         t       t or t      t       t   f
 * t    f   t and f         f       t or f      t       f   t
 * f    t   f and t         f       f or t      t
 * f    f   f and f         f       f or f      f
 * 
 * @author hadjitejuco
 */
public class Sample5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean x = true;
        boolean y = false;
        System.out.println(" a>b "+(a>b));
        System.out.println(" a<b "+(a<b));
        System.out.println(" a==b "+(a==b));
        System.out.println(" a!=b "+(a!=b));
        System.out.println();
        //logical and (&&)
        System.out.println(" x && y :"+(x && y));
        //logical or (||)
        System.out.println(" x || y :"+(x || y));
        //logical not !)
        System.out.println(" !x :"+(!x));
        
    }
}






