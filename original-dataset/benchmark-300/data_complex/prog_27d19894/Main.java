import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding some initial data to the ArrayList and LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Thread to perform the write operation
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to perform the read operation
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        writer.start();
        reader.start();

        // Wait for both threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex operations
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        System.out.println("LinkedList after adding ArrayList elements:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Creating a new ArrayList and adding elements from LinkedList
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            newList.add(linkedList.get(i));
        }

        System.out.println("New ArrayList after adding LinkedList elements:");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}