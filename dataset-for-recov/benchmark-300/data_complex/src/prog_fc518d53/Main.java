import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        List<Integer> list = new ArrayList<>();
        
        try {
            /* write */ queue.put(42);
            
            // Adding some complexity
            for (int i = 0; i < 10; i++) {
                list.add(i * 2);
            }
            
            // Processing the list
            for (Integer num : list) {
                System.out.println("List value: " + num);
            }
            
            // Simulating some delay
            Thread.sleep(1000);
            
            /* read */ int value = queue.take();
            System.out.println("Queue value: " + value);
            
            // More unrelated code
            String message = "This is a complex program!";
            System.out.println(message);
            
            // Another loop for complexity
            for (int i = 0; i < 5; i++) {
                System.out.println("Loop iteration: " + i);
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}