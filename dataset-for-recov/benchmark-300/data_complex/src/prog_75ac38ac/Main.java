import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();

        // Writing thread
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reading thread
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                list.add(value);
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

        // Additional complex code
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }

        // More unrelated code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriter = new Thread(() -> {
            try {
                stringQueue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReader = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println(message);
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