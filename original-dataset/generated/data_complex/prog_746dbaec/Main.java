import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        HashMap<String, Integer> map = new HashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Using executor to simulate complex operations
        executor.submit(() -> {
            for (int i = 0; i < 5; i++) {
                set.add(i * 10); // Adding multiple elements to the set
            }
        });

        executor.submit(() -> {
            for (String key : map.keySet()) {
                System.out.println("Map value for " + key + ": " + map.get(key));
            }
        });

        // Main thread adding a value to the set
        /* write */ set.add(42);

        executor.submit(() -> {
            try {
                Thread.sleep(100); // Simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // Check if the set contains specific values
            System.out.println("Set contains 20: " + set.contains(20));
        });

        // Shutdown the executor service
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final check for the original write-read pair
        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Set contains 42: " + containsValue);
    }
}