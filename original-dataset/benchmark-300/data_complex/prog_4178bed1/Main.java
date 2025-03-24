import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            SynchronousQueue<Integer> queue = new SynchronousQueue<>();
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Adding some initial data to the list and linkedList
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
                linkedList.add(i * 20);
            }

            // Thread to perform the write operation
            Thread writerThread = new Thread(() -> {
                try {
                    /* write */ queue.put(42);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            // Thread to perform the read operation
            Thread readerThread = new Thread(() -> {
                try {
                    /* read */ int value = queue.take();
                    System.out.println("Read value from queue: " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            // Start the threads
            writerThread.start();
            readerThread.start();

            // Wait for the threads to finish
            writerThread.join();
            readerThread.join();

            // Perform some operations on the list and linkedList
            for (int i = 0; i < list.size(); i++) {
                linkedList.add(list.get(i));
            }

            // Print the contents of the linkedList
            System.out.println("Contents of linkedList:");
            for (Integer num : linkedList) {
                System.out.println(num);
            }

            // Additional unrelated code to make the program more complex
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Sum of first 100 numbers: " + sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}