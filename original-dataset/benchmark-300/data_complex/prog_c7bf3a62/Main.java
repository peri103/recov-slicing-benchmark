import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        
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
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer and reader threads
        writer.start();
        reader.start();
        
        // Add some unrelated code to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        
        System.out.println("Generated list: " + list);
        
        // Calculate the sum of the list
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list: " + sum);
        
        // Wait for the writer and reader threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}