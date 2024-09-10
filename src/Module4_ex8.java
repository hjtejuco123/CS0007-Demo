/**
 * for
 * @author hadjitejuco
 */
public class Module4_ex8 {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5};
        //for each loop
        System.out.println("Using for each loop");
        for (int number : numbers ) {
            System.out.print(number+ " ");
        }
        System.out.println();
        System.out.println("Regular for loop ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        String[] names = {"Aida", "Lorna", "Fe"};        
        System.out.println("Print the name using For each");
        for (String name:names){
            System.out.print(name +" ");
        }
        System.out.println();
        
    }
}
