import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        /* write */ deque.addLast(42);
        
        // More unrelated operations
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        try {
            /* read */ int value = deque.takeLast();
            System.out.println("Deque value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated operations
        BlockingDeque<String> stringDeque = new LinkedBlockingDeque<>();
        stringDeque.addLast("Hello");
        stringDeque.addLast("World");
        
        try {
            System.out.println("String Deque: " + stringDeque.takeLast());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}