import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding some initial values to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Writing to the queue
        /* write */ queue.put(1);
        
        // Processing the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
        
        // Reading from the queue
        /* read */ int value = queue.take();
        System.out.println("Queue value: " + value);
        
        // Adding more values to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }
        
        // Processing the list again
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value after addition: " + list.get(i));
        }
    }
}