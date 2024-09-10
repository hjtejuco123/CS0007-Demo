//print all the numbers from 1 to 10 skip all even numbers
/**
 *
 * @author hadjitejuco
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if (i % 2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
       
        }
    }
