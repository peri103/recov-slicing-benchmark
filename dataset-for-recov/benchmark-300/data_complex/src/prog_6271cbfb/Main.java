import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        List<Integer> numbers = new ArrayList<>();

        // Adding some numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Adding numbers to the string queue
        for (Integer num : numbers) {
            stringQueue.put("Number: " + num);
        }

        // Writing to the original queue
        /* write */ queue.put(1);

        // Reading from the string queue
        for (int i = 0; i < 5; i++) {
            String str = stringQueue.take();
            System.out.println(str);
        }

        // Reading from the original queue
        /* read */ int value = queue.take();
        System.out.println("Value from original queue: " + value);

        // Additional unrelated code
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }
}