import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Adding some initial elements to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
        
        // Writer thread
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Reader thread
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writer.start();
        reader.start();
        
        // Perform some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }
        
        writer.join();
        reader.join();
        
        // Add more elements to the list and linkedList
        list.add(100);
        linkedList.add(200);
        
        // Print the updated list and linkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated List element: " + list.get(i));
        }
        
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Updated LinkedList element: " + linkedList.get(i));
        }
    }
}