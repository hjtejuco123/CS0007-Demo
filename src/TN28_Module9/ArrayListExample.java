//ArrayList
package TN28_Module9;

//import java.util.*;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hadji");
        names.add("Bob");
        names.add("James");
        names.add("Hadji");
        
        System.out.println("ArrayList Elements "+names);
        System.out.println("First Element: "+names.get(0));
        System.out.println("Element 2: "+names.get(2));
        names.remove(1);
        System.out.println("list of names after removal "+names);
                
        
        
    }
}
