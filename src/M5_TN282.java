/**
 * 
 * @author hadjitejuco
 */
public class M5_TN282 {
    
//    public static int add(int a, int b){
//        return a+b;
//    }
    
      public int add(int a, int b){
          return a+b;
      }  
    
    public static void main(String[] args) {
        M5_TN282 calc = new M5_TN282();
        
        //int result = add(1,2); static procedure
        int result = calc.add(8,9);
        System.out.println("result is "+result);
    }
}
