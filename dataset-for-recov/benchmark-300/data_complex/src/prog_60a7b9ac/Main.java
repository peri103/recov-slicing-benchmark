import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Initialize some data
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Perform some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Write to the BlockingQueue
        /* write */ queue.put(42);

        // Perform more operations
        for (int i = 0; i < linkedList.size(); i++) {
            list.add(linkedList.get(i));
        }

        // Read from the BlockingQueue
        /* read */ int value = queue.take();
        System.out.println(value);

        // Print the final state of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}