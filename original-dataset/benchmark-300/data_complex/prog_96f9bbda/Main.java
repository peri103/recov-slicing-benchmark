import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Start a thread to write to the queue
        new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Add some elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Transfer elements from list to linkedList
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Print elements from linkedList
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Read from the queue
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add more elements to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Print elements from list
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}