import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Write thread
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Read thread
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Value read from queue: " + value);
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

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        System.out.println("ArrayList contents:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("LinkedList contents:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Another SynchronousQueue for additional complexity
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriter = new Thread(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReader = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Message read from stringQueue: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        stringWriter.start();
        stringReader.start();

        try {
            stringWriter.join();
            stringReader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}