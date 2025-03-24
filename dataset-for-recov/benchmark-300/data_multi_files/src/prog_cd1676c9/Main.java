import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        
        // Adding some unrelated operations
        LinkedBlockingDeque<Integer> tempDeque = new LinkedBlockingDeque<>();
        for (int i = 0; i < 5; i++) {
            tempDeque.addLast(i * 10);
        }
        
        // Simulating some delay
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Performing the write operation
        dequeOps.addFirst(randomNumber);
        
        // Adding more unrelated operations
        for (int i = 0; i < 3; i++) {
            tempDeque.addLast(i * 20);
        }
        
        // Simulating some delay
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Performing the read operation
        try {
            /* read */ int value = dequeOps.takeFirst();
            System.out.println("Value read from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Adding more unrelated operations
        for (int i = 0; i < tempDeque.size(); i++) {
            System.out.println("Temp deque element at index " + i + ": " + tempDeque.pollFirst());
        }
    }
}