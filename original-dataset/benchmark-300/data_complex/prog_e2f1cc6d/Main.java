import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding some elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Printing elements from the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        /* write */ queue.put(1);
        
        // Adding more elements to the list
        list.add(100);
        list.add(200);
        
        // Printing the new elements from the list
        for (int i = 5; i < list.size(); i++) {
            System.out.println("New list element: " + list.get(i));
        }
        
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);
        
        // Creating another queue and performing operations
        LinkedBlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        stringQueue.put("Hello");
        stringQueue.put("World");
        
        // Printing elements from the string queue
        System.out.println("String from queue: " + stringQueue.take());
        System.out.println("String from queue: " + stringQueue.take());
    }
}