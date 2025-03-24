import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some unrelated operations
        linkedList.add("Hello");
        linkedList.add("World");
        for (String str : linkedList) {
            System.out.println(str);
        }

        // Thread to write the value
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Add more unrelated operations
        list.add(10);
        list.add(20);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }

        // Thread to read the value
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
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

        // Final unrelated operations
        linkedList.clear();
        list.clear();
        System.out.println("All operations completed.");
    }
}