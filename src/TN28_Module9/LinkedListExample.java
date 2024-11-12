
package TN28_Module9;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        System.out.println("Elements "+numbers);
        
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("Elements "+numbers);
    }
    
    
}
