import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Adding some random numbers to the list
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }

        // Printing the list
        System.out.println("List before operations: " + list);

        // Performing some operations on the list
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

        // Printing the modified list
        System.out.println("List after doubling values: " + list);

        // Writing a value to the queue
        /* write */ queue.put(42);

        // Performing some more operations on the list
        list.removeIf(n -> n < 50);

        // Printing the list after filtering
        System.out.println("List after filtering values less than 50: " + list);

        // Reading the value from the queue
        /* read */ int value = queue.take();

        // Printing the value read from the queue
        System.out.println("Value read from the queue: " + value);

        // Adding more elements to the list
        for (int i = 0; i < 3; i++) {
            list.add(random.nextInt(100));
        }

        // Printing the final list
        System.out.println("Final list: " + list);
    }
}