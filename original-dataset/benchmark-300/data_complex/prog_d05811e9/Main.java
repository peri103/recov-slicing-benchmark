import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Adding some unrelated data to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding some strings to the string list
        stringList.add("Hello");
        stringList.add("World");

        // Thread to write data to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read data from the queue
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to complete
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the list and string list
        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Additional unrelated operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);

        String concatenatedString = String.join(" ", stringList);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}