import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        List<Integer> list = new ArrayList<>();
        
        try {
            /* write */ queue.put(42);
            
            // Adding unrelated code to make the program more complex
            for (int i = 0; i < 10; i++) {
                list.add(i * 2);
            }
            
            // Another unrelated operation
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            System.out.println("Sum of list elements: " + sum);
            
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
            
            // More unrelated code
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            for (String str : stringList) {
                System.out.println(str);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}