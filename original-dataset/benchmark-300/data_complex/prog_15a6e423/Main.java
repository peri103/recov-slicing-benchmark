import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        ArrayList list = new ArrayList();
        LinkedList queue = new LinkedList();
        
        // Adding elements to the ArrayList and LinkedList
        list.add("Hello");
        queue.add("World");
        
        // Writing to the CopyOnWriteArraySet
        /* write */ set.add(42);
        
        // Performing some operations with ArrayList and LinkedList
        list.add(queue.poll());
        queue.add(list.get(0));
        
        // Reading from the CopyOnWriteArraySet
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains value 42: " + containsValue);
        
        // Adding more elements to the CopyOnWriteArraySet
        set.add(100);
        set.add(200);
        
        // Iterating over the CopyOnWriteArraySet
        for (Object obj : set) {
            System.out.println("Set element: " + obj);
        }
        
        // Performing more operations with ArrayList and LinkedList
        list.addAll(queue);
        queue.addAll(list);
        
        // Final output
        System.out.println("ArrayList: " + list);
        System.out.println("LinkedList: " + queue);
    }
}