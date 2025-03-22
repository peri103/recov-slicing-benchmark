import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        
        // Add some elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        
        // Add some elements to the string list
        stringList.add("Hello");
        stringList.add("World");
        
        // Perform some operations on the deque
        deque.addFirst(99);
        deque.addLast(100);
        deque.addFirst(98);
        
        // Add elements to the deque
        /* write */ deque.addLast(42);
        
        // Perform some operations on the arrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element: " + arrayList.get(i));
        }
        
        // Perform some operations on the stringList
        for (String str : stringList) {
            System.out.println("StringList element: " + str);
        }
        
        // Perform some more operations on the deque
        int firstElement = deque.removeFirst();
        System.out.println("Removed first element: " + firstElement);
        
        // Finally, read the last element added to the deque
        /* read */ int value = deque.getLast();
        System.out.println("Last element in deque: " + value);
        
        // Further operations
        deque.clear();
        System.out.println("Deque cleared. Size: " + deque.size());
        
        // Add elements back to deque
        deque.addLast(55);
        deque.addLast(65);
        deque.addLast(75);
        
        // Print all elements in deque
        for (Integer num : deque) {
            System.out.println("Deque element: " + num);
        }
    }
}