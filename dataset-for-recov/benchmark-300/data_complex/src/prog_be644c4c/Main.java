import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some unrelated operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Read value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the linked list
        System.out.println("Linked List contents:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Add more unrelated operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("String List contents:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}