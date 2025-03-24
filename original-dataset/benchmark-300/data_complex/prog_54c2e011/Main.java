import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        List<Integer> list = new ArrayList<>();
        
        // Add some unrelated operations to make the program more complex
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        
        // Perform the write operation
        /* write */ deque.addLast(42);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
        
        // Perform the read operation
        /* read */ int value = deque.takeLast();
        System.out.println("Value read from deque: " + value);
        
        // Add more unrelated operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}