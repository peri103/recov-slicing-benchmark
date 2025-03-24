import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Thread to write the value
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Add some unrelated operations
        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i * 2);
        }

        // Thread to read the value
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

        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        System.out.println("ArrayList contents:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("LinkedList contents:");
        for (int num : linkedList) {
            System.out.println(num);
        }
    }
}